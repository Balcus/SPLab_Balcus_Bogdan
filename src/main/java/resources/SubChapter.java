package resources;

import lombok.*;

import java.util.List;

@Getter
@Setter
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
                img.print();
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
                t.print();
            }
        } else {
            System.out.println("  No tables");
        }
    }
}
