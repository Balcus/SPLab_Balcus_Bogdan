package ro.uvt.info.sp_lab_2025.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Paragraph extends Element {
    private String text;

    @Convert(converter = AlignStrategyConverter.class)
    private AlignStrategy textAlignment = new AlignLeft();

    @JsonIgnore
    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        textAlignment.render(this);
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