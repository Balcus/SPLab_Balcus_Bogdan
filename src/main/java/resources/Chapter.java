package resources;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Chapter {
    private String Name;
    private List<SubChapter> SubChapters;

    public void print() {
        System.out.println("[Chapter] Name: " + Name);
        System.out.println("SubChapters: ");
        for (SubChapter subChapter : SubChapters) {
            subChapter.print();
        }

    }

}
