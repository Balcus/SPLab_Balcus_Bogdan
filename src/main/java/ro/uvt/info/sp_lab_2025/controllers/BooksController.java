package ro.uvt.info.sp_lab_2025.controllers;

import ro.uvt.info.sp_lab_2025.models.Book;
import org.springframework.web.bind.annotation.*;
import ro.uvt.info.sp_lab_2025.observers.AllBooksSubject;
import ro.uvt.info.sp_lab_2025.services.BookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BookService bookService;
    private final AllBooksSubject allBooksSubject;

    public BooksController(BookService bookService, AllBooksSubject allBooksSubject) {
        this.bookService = bookService;
        this.allBooksSubject = allBooksSubject;
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
    public String createBook(@RequestBody Book book) {
        Integer bookId = bookService.addBook(book);
        Book savedBook = bookService.getBookById(bookId);
        allBooksSubject.add(savedBook);
        return "Book saved [" + savedBook.getId() + "] " + savedBook.getTitle();
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Integer id, @RequestBody Book book) {
        return bookService.updateBook(id, book);
    }

    @DeleteMapping("/{id}")
    public Integer deleteBook(@PathVariable Integer id) {
        return bookService.deleteBookById(id);
    }
}