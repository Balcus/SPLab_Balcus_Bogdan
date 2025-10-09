package resources;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String title;
    private List<Author> authors;
    private List<Element> elements;

    public Book(String t) {
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
        if (element.parent != null) {
            throw new Exception("It is not allowed for an element to have multiple parents");
        }
        this.elements.add(element);
        element.setParent(this);
    }
}
