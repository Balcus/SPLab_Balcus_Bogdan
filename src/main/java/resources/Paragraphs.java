package resources;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Paragraphs {
    private String Text;

    public void print() {
        System.out.println("[Paragraph] text: " + Text);
    }
}
