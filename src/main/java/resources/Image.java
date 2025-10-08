package resources;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Image implements IElement {
    private String ImageName;

    @Override
    public void print() {
        System.out.println("[Image] ImageName: " + ImageName);
    }
}
