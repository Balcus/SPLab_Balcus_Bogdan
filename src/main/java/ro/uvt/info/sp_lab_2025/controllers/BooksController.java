package ro.uvt.info.sp_lab_2025.controllers;

import ro.uvt.info.sp_lab_2025.models.Book;
import org.springframework.web.bind.annotation.*;
import ro.uvt.info.sp_lab_2025.services.BookService;

import java.util.List;

@RestController
public class BooksController {

    private final BookService bookService;

    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Integer id) {
        return bookService.getBookById(id);
    }

    @PostMapping
    public Integer createBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @DeleteMapping("/{id}")
    public Integer deleteBook(@PathVariable Integer id) {
        return bookService.deleteBookById(id);
    }

}
