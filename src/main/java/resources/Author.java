package resources;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    private String Name;

    public void print() {
        System.out.println("[Author] Name: " + this.Name);
    }
}
