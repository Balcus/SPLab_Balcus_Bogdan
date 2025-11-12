package ro.uvt.info.sp_lab_2025.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    private String name;

    public void print() {
        System.out.println("[Author] Name: " + this.name);
    }
}
