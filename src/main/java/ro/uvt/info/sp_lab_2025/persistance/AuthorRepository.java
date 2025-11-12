package ro.uvt.info.sp_lab_2025.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.uvt.info.sp_lab_2025.models.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
