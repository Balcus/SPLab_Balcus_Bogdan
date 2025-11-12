package ro.uvt.info.sp_lab_2025.services;

import ro.uvt.info.sp_lab_2025.models.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class BookService {

    private final List<Book> bookDb = new ArrayList<>();
    private final AtomicInteger bookId = new AtomicInteger(1);

    public Integer addBook(Book book) {
        book.setId(bookId.getAndIncrement());
        bookDb.add(book);
        return book.getId();
    }

    public List<Book> getBooks() {
        return bookDb;
    }

    public Book getBookById(int id) {
        return bookDb.stream()
                .filter(book -> book.getId() == id)
                .findFirst().orElse(null);
    }

    public Integer deleteBookById(int id) {
        bookDb.removeIf(book -> book.getId() == id);
        return id;
    }
}
