package by.overone.lesson18;

import java.util.List;

public class Person<T extends Number, K extends String> {
    private T id;
    private K name;

    public Person(T id, K name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public K getName() {
        return name;
    }

    public void setName(K name) {
        this.name = name;
    }

    public <M extends Book> M readBook(M book) {
        return book;
    }

    public static <T extends Book> void getBookNames(List<T> books) {
        for (T book : books) {
            System.out.println(book.getName());
        }
        // for(Тип_объекта имя_объекта : коллекция){
        // }
    }

}
