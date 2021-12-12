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
            System.out.println("3. Add book");
            System.out.println("4. Exit");
            int result = sc.nextInt();
            switch (result) {
                case 1:
                    readAll();
                    break;
                case 2:
                    readByAuthor();
                    break;
                case 3:
                    addBook();
                    break;
                case 4:
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

        System.out.println("Select one of the following columns");
        System.out.println("1.Title");
        System.out.println("2.Author");
        System.out.println("3.Quantity");
        System.out.println("4.Exit");
        int column = sc.nextInt();
        List<Book> books = bookService.readAll();
        Book oldBook = books.get(bookId - 1);
        String title = oldBook.getTitle();
        String author = oldBook.getAuthor();
        long quantity = oldBook.getQuantity();

        sc.skip("((?<!\\R)\\s)*");

        switch (column) {
            case 1:
                System.out.println("Input new Title");
                title = Main.sc.nextLine();
                break;
            case 2:
                System.out.println("Input new Author");
                author = Main.sc.nextLine();
                break;
            case 3:
                System.out.println("Input new Quantity");
                quantity = Main.sc.nextLong();
                break;
            case 4:
                System.out.println("Exit for update");
                break;
            default:
                System.err.println("Columns not find ... ");
        }
        try {
            bookService.updateBook(bookId, title, author, quantity);
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
