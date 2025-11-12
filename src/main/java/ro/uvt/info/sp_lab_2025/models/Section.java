package ro.uvt.info.sp_lab_2025.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Section extends Element {
    private String title;

    @OneToMany(mappedBy = "sectionParent", cascade = CascadeType.ALL, orphanRemoval = true)
    private ArrayList<Element> elements;

    public Section(String Title) {
        this.title = Title;
        this.elements = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("[Section] Title: " + title);
        if (elements.isEmpty()) {
            return;
        }
        System.out.println("Elements: ");
        for (Element e : elements) {
            e.print();
        }
    }

    @Override
    public void add(Element element) throws Exception {
        if (element.getBookParent() != null || element.getSectionParent() != null) {
            throw new Exception("It is not allowed for an element to have multiple parents");
        }
        this.elements.add(element);
        element.setParent(this);
    }

    @Override
    public void removeElement(Element element) {
        this.elements.remove(element);
    }

    @Override
    public Element getElement(int i) {
        return this.elements.get(i);
    }
}
