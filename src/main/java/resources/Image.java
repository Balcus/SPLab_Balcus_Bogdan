package resources;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Image {
    private String ImageName;

    public void print() {
        System.out.println("[Image] ImageName: " + ImageName);
    }
}
