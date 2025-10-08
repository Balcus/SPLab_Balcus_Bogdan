package resources;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubChapter {
    private String Name;
    private List<Image> Images;
    private List<Paragraphs> Paragraphs;
    private List<Table> Tables;

    public void print() {
        System.out.println("[SubChapter] Name: " + Name);

        if (Images != null && !Images.isEmpty()) {
            System.out.println("  Images:");
            for (Image img : Images) {
                System.out.println("    - " + img);
            }
        } else {
            System.out.println("  No images");
        }

        if (Paragraphs != null && !Paragraphs.isEmpty()) {
            System.out.println("  Paragraphs:");
            for (Paragraphs p : Paragraphs) {
                System.out.print("    ");
                p.print();
            }
        } else {
            System.out.println("  No paragraphs");
        }

        if (Tables != null && !Tables.isEmpty()) {
            System.out.println("  Tables:");
            for (Table t : Tables) {
                System.out.println("    - " + t);
            }
        } else {
            System.out.println("  No tables");
        }
    }
}
