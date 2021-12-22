package by.overone.lesson31.service;

import by.overone.lesson31.entity.Book;

import java.util.List;

public interface IBookService {
    List<Book> readAll();

    List<Book> readByAuthor(String authorName);

    void addBook(String title, String author, Long quantity);

    void deleteBook(int bookId);

    void updateBook(Book bookUpdate);

    Book readById(int idBook);
}
