package resources;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Chapter {
    private String Name;
    private List<SubChapter> SubChapters;

    public void print() {
        System.out.println("[Chapter] Name: " + Name + "/nSubChapters: ");
        for (SubChapter subChapter : SubChapters) {
            subChapter.print();
        }

    }

}
