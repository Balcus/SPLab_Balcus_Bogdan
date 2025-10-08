package ro.uvt.info.sp_lab_2025;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import resources.*;

import java.util.List;

@SpringBootApplication
public class SpLab2025Application {

    public static void main(String[] args) {
        Author author1 = new Author("Robert C. Martin");
        Author author2 = new Author("Martin Fowler");

        IElement p1 = new Paragraph("Clean code is readable, understandable, and maintainable.");
        IElement p2 = new Paragraph("Refactoring helps keep your code clean.");

        IElement img1 = new Image("clean_code_diagram.png");
        IElement table1 = new Table("SOLID Principles");

        SubChapter sc1 = new SubChapter(
                "Writing Clean Code",
                List.of(img1, p1, p2, table1)
        );

        Chapter ch1 = new Chapter("Introduction to Clean Code", List.of(sc1));
        TableOfContents tableOfContents = new TableOfContents();

        Book book = new Book(
                "Clean Code: A Handbook of Agile Software Craftsmanship",
                List.of(author1, author2),
                List.of(ch1),
                tableOfContents
        );

        book.print();
    }

}
