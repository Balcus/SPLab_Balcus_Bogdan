package ro.uvt.info.sp_lab_2025.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.info.sp_lab_2025.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
