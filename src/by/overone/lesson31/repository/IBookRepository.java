package by.overone.lesson31.repository;

import by.overone.lesson31.entity.Book;

import java.util.List;

public interface IBookRepository {
    List<Book> readAll();

    List<Book> readByAuthor(String authorName);

    void addBook(String title, String author, Long quantity);

    void deleteBook(int bookId);

    void updateBook(int bookId, String title, String author, long quantity);
}
