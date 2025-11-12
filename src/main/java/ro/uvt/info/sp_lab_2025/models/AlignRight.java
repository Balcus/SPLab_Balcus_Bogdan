package ro.uvt.info.sp_lab_2025.models;

public class AlignRight implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        String alignedText = String.format("%" + 25 + "s", paragraph.getText());
        System.out.println(alignedText);
    }
}
