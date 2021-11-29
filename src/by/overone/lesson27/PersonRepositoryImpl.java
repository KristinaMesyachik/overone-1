package by.overone.lesson27;

import java.io.*;

public class PersonRepositoryImpl implements IPersonRepository {
    @Override
    public void create(Person person) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("2.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(person);
        objectOutputStream.close();
    }

    @Override
    public Person read() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("2.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Person person = (Person) objectInputStream.readObject();
        objectInputStream.close();
        return person;
    }
}
