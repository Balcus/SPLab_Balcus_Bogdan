package ro.uvt.info.sp_lab_2025.models;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@jakarta.persistence.Table(name = "BookTable")
public class Table extends Element {
    private String title;

    @Override
    public void print() {
        System.out.println("[Table] Title: " + title);
    }

    @Override
    public void add(Element element) {
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public void removeElement(Element element) {
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public Element getElement(int i) {
        throw new UnsupportedOperationException("Not supported.");
    }
}