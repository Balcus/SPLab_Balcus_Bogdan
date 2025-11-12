package ro.uvt.info.sp_lab_2025.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Element {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book bookParent;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section sectionParent;

    public void setParent(Object parent) throws UnsupportedOperationException {
        if (parent instanceof Book) {
            this.bookParent = (Book) parent;
            this.sectionParent = null;
            return;
        } else if (parent instanceof Section) {
            this.sectionParent = (Section) parent;
            this.bookParent = null;
            return;
        }
        throw new UnsupportedOperationException("Parent must be Book or Section");
    }

    public abstract void print();
    public abstract void add(Element element) throws Exception;
    public abstract void removeElement(Element element);
    public abstract Element getElement(int i);
}
