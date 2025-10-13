package resources;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Paragraph extends Element {
    private String text;
    private AlignStrategy textAlignment = new AlignLeft();

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
