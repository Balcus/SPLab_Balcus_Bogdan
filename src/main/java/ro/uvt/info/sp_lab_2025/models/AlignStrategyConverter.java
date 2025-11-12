package ro.uvt.info.sp_lab_2025.models;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class AlignStrategyConverter implements AttributeConverter<AlignStrategy, String> {

    @Override
    public String convertToDatabaseColumn(AlignStrategy attribute) {
        return switch (attribute) {
            case AlignLeft alignLeft -> "LEFT";
            case AlignCenter alignCenter -> "CENTER";
            case AlignRight alignRight -> "RIGHT";
            case null, default -> "LEFT";
        };

    }

    @Override
    public AlignStrategy convertToEntityAttribute(String dbData) {
        if (dbData == null) {
            return new AlignLeft();
        }

        return switch (dbData) {
            case "CENTER" -> new AlignCenter();
            case "RIGHT" -> new AlignRight();
            default -> new AlignLeft();
        };
    }
}