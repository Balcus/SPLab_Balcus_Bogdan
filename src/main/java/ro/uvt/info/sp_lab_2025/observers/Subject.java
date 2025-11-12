package ro.uvt.info.sp_lab_2025.observers;

import ro.uvt.info.sp_lab_2025.models.Book;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers(Book book);
}