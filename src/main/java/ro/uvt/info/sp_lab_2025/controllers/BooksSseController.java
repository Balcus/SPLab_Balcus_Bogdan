package ro.uvt.info.sp_lab_2025.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import ro.uvt.info.sp_lab_2025.observers.AllBooksSubject;
import ro.uvt.info.sp_lab_2025.observers.SseObserver;

@RestController
@RequestMapping("/books-sse")
public class BooksSseController {

    private final AllBooksSubject allBooksSubject;

    public BooksSseController(AllBooksSubject allBooksSubject) {
        this.allBooksSubject = allBooksSubject;
    }

    @GetMapping
    public ResponseBodyEmitter getBooksSse() {
        final SseEmitter emitter = new SseEmitter(0L);
        SseObserver observer = new SseObserver(emitter);
        allBooksSubject.attach(observer);

        emitter.onCompletion(() -> allBooksSubject.detach(observer));
        emitter.onTimeout(() -> allBooksSubject.detach(observer));
        emitter.onError((e) -> allBooksSubject.detach(observer));

        return emitter;
    }
}