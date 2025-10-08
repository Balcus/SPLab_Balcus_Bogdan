package resources;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String Title;
    private List<Author> Authors;
    private List<Chapter> Chapters;
    TableOfContents TableOfContents;

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
