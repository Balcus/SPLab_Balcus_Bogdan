package ro.uvt.info.sp_lab_2025.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Author> authors;

    @OneToMany(mappedBy = "bookParent", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Element> elements;

    public Book(String t) {
        this.id = null;
        this.title = t;
        this.authors = new ArrayList<>();
        this.elements = new ArrayList<>();
    }

    public void print() {
        System.out.println("[Book] Title: " + title);

        if (authors.isEmpty()) {
            return;
        }
        for (Author a : authors) {
            a.print();
        }

        if (elements.isEmpty()) {
            return;
        }
        for (Element e : elements) {
            e.print();
        }
    }

    public void addAuthor(Author auth) {
        this.authors.add(auth);
    }

    public void addContent(Element element) throws Exception {
        if (element.getBookParent() != null || element.getSectionParent() != null) {
            throw new Exception("It is not allowed for an element to have multiple parents");
        }
        this.elements.add(element);
        element.setParent(this);
    }
}
