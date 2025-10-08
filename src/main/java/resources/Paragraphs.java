package resources;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paragraphs {
    private String Text;

    public void print() {
        System.out.println("[Paragraph] text: " + Text);
    }
}
