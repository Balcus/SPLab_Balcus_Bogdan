package resources;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Table {
    private String Title;

    public void print() {
        System.out.println("[Table] Title: " + Title);
    }
}
