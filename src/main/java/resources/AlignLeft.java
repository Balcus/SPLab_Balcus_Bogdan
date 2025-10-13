package resources;

public class AlignLeft implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        String alignedText = String.format("%-" + 25 + "s", paragraph.getText());
        System.out.println(alignedText);
    }
}
