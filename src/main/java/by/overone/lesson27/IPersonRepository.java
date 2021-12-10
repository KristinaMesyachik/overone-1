package by.overone.lesson27;

import java.io.IOException;

public interface IPersonRepository {

    void create(Person person) throws IOException;

    Person read() throws IOException, ClassNotFoundException;
}
