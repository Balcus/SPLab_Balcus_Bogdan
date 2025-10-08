package resources;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Paragraph implements IElement {
    private String Text;

    @Override
    public void print() {
        System.out.println("[Paragraph] text: " + Text);
    }
}
