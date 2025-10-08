package ro.uvt.info.sp_lab_2025;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import resources.*;

import java.util.List;

@SpringBootApplication
public class SpLab2025Application {

    public static void main(String[] args) {
        Author author1 = new Author("Robert C. Martin");
        Author author2 = new Author("Martin Fowler");

        Paragraphs p1 = new Paragraphs("Clean code is readable, understandable, and maintainable.");
        Paragraphs p2 = new Paragraphs("Refactoring helps keep your code clean.");

        Image img1 = new Image("clean_code_diagram.png");
        Table table1 = new Table("SOLID Principles");

        SubChapter sc1 = new SubChapter(
                "Writing Clean Code",
                List.of(img1),
                List.of(p1, p2),
                List.of(table1)
        );

        Chapter ch1 = new Chapter("Introduction to Clean Code", List.of(sc1));

        Book book = new Book(
                "Clean Code: A Handbook of Agile Software Craftsmanship",
                List.of(author1, author2),
                List.of(ch1)
        );

        book.print();
    }

}
