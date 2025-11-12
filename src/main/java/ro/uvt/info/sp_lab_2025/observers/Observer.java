package ro.uvt.info.sp_lab_2025.observers;

import ro.uvt.info.sp_lab_2025.models.Book;

public interface Observer {
    void update(Book book);
}