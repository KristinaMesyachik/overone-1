package by.overone.lesson31.controller;

import by.overone.lesson31.entity.Book;
import by.overone.lesson31.exception.BookNotFoundException;

import by.overone.lesson31.main.Main;
import by.overone.lesson31.service.IBookService;
import by.overone.lesson31.service.impl.BookService;

import java.util.List;

import static by.overone.lesson31.main.Main.sc;

public class BookController {

    private static final IBookService bookService = new BookService();

    public void mainMenu() {
        boolean flag = true;

        while (flag) {
            System.out.println("Select one of the following option:");
            System.out.println("1. Get all books");
            System.out.println("2. Get book by author");
            System.out.println("3. Get book by id");
            System.out.println("4. Add book");
            System.out.println("5. Exit");
            int result = sc.nextInt();
            switch (result) {
                case 1:
                    readAll();
                    break;
                case 2:
                    readByAuthor();
                    break;
                case 3:
                    readById();
                    break;
                case 4:
                    addBook();
                    break;
                case 5:
                    System.out.println("Bye-bye my dear friend");
                    flag = false;
                    break;
                default:
                    System.err.println("Something went wrong ..");
            }
        }
    }

    public void readAll() {
        List<Book> books = bookService.readAll();
        viewBooks(books);
        boolean flag = true;
        while (flag) {
            System.out.println("Select one ID of the following book:");
            int bookId = sc.nextInt();
            System.out.println("1. Update book");
            System.out.println("2. Delete book");
            System.out.println("3. Exit");
            int operation = sc.nextInt();
            switch (operation) {
                case 1:
                    updateBook(bookId);
                    flag = false;
                    break;
                case 2:
                    deleteBook(bookId);
                    flag = false;
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.err.println("Something went wrong ..");
            }
        }
    }

    public void updateBook(int bookId) {
        Book bookUpdate = bookService.readById(bookId);
        boolean flag = true;
        int column;
        while (flag) {
            System.out.println("Select one of the following columns");
            System.out.println("1.Title");
            System.out.println("2.Author");
            System.out.println("3.Quantity");
            System.out.println("4.Exit");
            column = sc.nextInt();

            sc.skip("((?<!\\R)\\s)*");

            switch (column) {
                case 1:
                    System.out.println("Old Title: " + bookUpdate.getTitle() + "Input new Title");
                    bookUpdate.setTitle(Main.sc.nextLine());
                    break;
                case 2:
                    System.out.println("Old Author: " + bookUpdate.getAuthor() + "Input new Author");
                    bookUpdate.setAuthor(Main.sc.nextLine());
                    break;
                case 3:
                    System.out.println("Old Quantity: " + bookUpdate.getQuantity() + "Input new Quantity");
                    bookUpdate.setQuantity(Main.sc.nextLong());
                    break;
                case 4:
                    System.out.println("Exit for update");
                    flag = false;
                    break;
                default:
                    System.err.println("Columns not find ... ");
            }
        }
        try {
            bookService.updateBook(bookUpdate);
        } catch (BookNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    public void deleteBook(int bookId) {
        try {
            bookService.deleteBook(bookId);
            readAll();

        } catch (BookNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    public void addBook() {
        sc.skip("((?<!\\R)\\s)*");
        System.out.println("Input title book");
        String title = sc.nextLine();
        System.out.println("Input author book");
        String author = sc.nextLine();
        System.out.println("Input quantity");
        Long quantity = sc.nextLong();
        try {
            bookService.addBook(title, author, quantity);
            readAll();
        } catch (BookNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    public void readByAuthor() {
        sc.skip("((?<!\\R)\\s)*");
        System.out.println("Write author: ");
        String authorName = sc.nextLine();
        List<Book> books = null;
        try {
            books = bookService.readByAuthor(authorName);
        } catch (BookNotFoundException e) {
            System.err.println(e.getMessage());
        }
        viewBooks(books);
    }

    public void readById() {
        sc.skip("((?<!\\R)\\s)*");
        System.out.println("Write id: ");
        int idBook = sc.nextInt();
        sc.skip("((?<!\\R)\\s)*");
        Book book = null;
        try {
            book = bookService.readById(idBook);
        } catch (BookNotFoundException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(book);
    }

    private void viewBooks(List<Book> books) {
        if (books != null) {
            int counter = 1;
            for (Book book : books) {
                System.out.println(counter + ". " + book);
                counter++;
            }
        }
    }
}
