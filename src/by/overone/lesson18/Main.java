package by.overone.lesson18;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("A");
        Book book1 = new Book("B");
        Book book2 = new Book("C");

        AdventureBook adventureBook1 = new AdventureBook("Adv_A");
        AdventureBook adventureBook2 = new AdventureBook("Adv_B");
        AdventureBook adventureBook3 = new AdventureBook("Adv_C");

        HistoryBook historyBook1 = new HistoryBook("History_A");
        HistoryBook historyBook2 = new HistoryBook("History_B");
        HistoryBook historyBook3 = new HistoryBook("History_C");

        List<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book1);
        books.add(book2);

        List<AdventureBook> adventureBooks = new ArrayList<>();

        adventureBooks.add(adventureBook1);
        adventureBooks.add(adventureBook2);
        adventureBooks.add(adventureBook3);

        List<HistoryBook> historyBooks = new ArrayList<>();

        historyBooks.add(historyBook1);
        historyBooks.add(historyBook2);
        historyBooks.add(historyBook3);

        Person.getBookNames(books);
        Person.getBookNames(adventureBooks);
        Person.getBookNames(historyBooks);


    }
}
