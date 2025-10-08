package resources;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Table implements IElement {
    private String Title;

    @Override
    public void print() {
        System.out.println("[Table] Title: " + Title);
    }
}
