package ro.uvt.info.sp_lab_2025.services;

import org.springframework.stereotype.Service;
import ro.uvt.info.sp_lab_2025.models.Book;
import ro.uvt.info.sp_lab_2025.persistance.CrudRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final CrudRepository<Book, Integer> bookRepository;

    public BookService(CrudRepository<Book, Integer> bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Integer addBook(Book book) {
        Book saved = bookRepository.save(book);
        return saved.getId();
    }

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Integer id) {
        Optional<Book> book = bookRepository.findById(id);
        return book.orElse(null);
    }

    public Integer deleteBookById(Integer id) {
        bookRepository.deleteById(id);
        return id;
    }

    public Book updateBook(Integer id, Book updatedBook) {
        Optional<Book> existing = bookRepository.findById(id);
        if (existing.isPresent()) {
            Book book = existing.get();
            book.setTitle(updatedBook.getTitle());
            book.setAuthors(updatedBook.getAuthors());
            book.setElements(updatedBook.getElements());
            return bookRepository.save(book);
        }
        return null;
    }
}