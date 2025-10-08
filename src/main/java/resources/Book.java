package resources;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String Title;
    private List<Author> Authors;
    private List<Chapter> Chapters;

    public void print() {
        System.out.println("[Book] Title: " + Title);

        if (Authors != null && !Authors.isEmpty()) {
            System.out.println("Authors:");
            for (Author author : Authors) {
                author.print();
            }
        } else {
            System.out.println("No authors");
        }

        if (Chapters != null && !Chapters.isEmpty()) {
            System.out.println("Chapters:");
            for (Chapter chapter : Chapters) {
                chapter.print();
            }
        } else {
            System.out.println("No chapters");
        }
    }
}
