package ro.uvt.info.sp_lab_2025.observers;

import org.springframework.stereotype.Component;
import ro.uvt.info.sp_lab_2025.models.Book;

import java.util.ArrayList;
import java.util.List;

@Component
public class AllBooksSubject implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Book book) {
        for (Observer observer : observers) {
            observer.update(book);
        }
    }

    public void add(Book book) {
        notifyObservers(book);
    }
}