package ro.uvt.info.sp_lab_2025.persistance;

import org.springframework.stereotype.Component;
import ro.uvt.info.sp_lab_2025.models.Book;

import java.util.List;
import java.util.Optional;

@Component
public class BookRepositoryAdapter implements CrudRepository<Book, Integer> {

    private final BookRepository bookRepository;

    public BookRepositoryAdapter(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book save(Book entity) {
        return bookRepository.save(entity);
    }

    @Override
    public Optional<Book> findById(Integer id) {
        return bookRepository.findById(id);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        bookRepository.deleteById(id);
    }
}