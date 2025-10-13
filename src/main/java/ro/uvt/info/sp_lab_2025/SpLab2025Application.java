package ro.uvt.info.sp_lab_2025;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import resources.*;

import java.util.List;

@SpringBootApplication
public class SpLab2025Application {
    public static void main(String[] args) throws Exception {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        System.out.println("Printing without Alignment");
        System.out.println();
        cap1.print();
        p1.setTextAlignment(new AlignCenter());
        p2.setTextAlignment(new AlignRight());
        p3.setTextAlignment(new AlignLeft());
        System.out.println();
        System.out.println("Printing with Alignment");
        System.out.println();
        cap1.print();
    }
}

