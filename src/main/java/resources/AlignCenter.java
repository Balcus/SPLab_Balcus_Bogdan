package resources;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        var text = paragraph.getText();
        var width = 25;
        if (text.length() >= width) {
            System.out.println(text);
            return;
        }

        int padding = (width - text.length()) / 2;
        String alignedText = String.format("%" + (padding + text.length()) + "s", text);
        alignedText = String.format("%-" + width + "s", alignedText);
        System.out.println(alignedText);
    }
}
