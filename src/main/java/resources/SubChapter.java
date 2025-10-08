package resources;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SubChapter {
    private String Name;
    private List<IElement> Elements;

    public void print() {
        System.out.println("[SubChapter] Name: " + Name);

        for (IElement element : Elements) {
            element.print();
        }
    }
}
