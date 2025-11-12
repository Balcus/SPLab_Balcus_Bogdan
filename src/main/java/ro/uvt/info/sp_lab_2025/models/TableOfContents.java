package ro.uvt.info.sp_lab_2025.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class TableOfContents extends Element {
    public void print() {
        System.out.println("Table of Contents");
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
