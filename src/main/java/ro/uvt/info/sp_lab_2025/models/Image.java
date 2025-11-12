package ro.uvt.info.sp_lab_2025.models;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Image extends Element {
    private String imageName;

    @Override
    public void print() {
        System.out.println("[Image] ImageName: " + imageName);
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
