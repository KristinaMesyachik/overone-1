package by.overone.lesson27;

public class MainSerializable {

    private static final IPersonRepository personRepository = new PersonRepositoryImpl();

    public static void main(String[] args) throws Exception {
        Dog dog = new Dog("Keks", 4.0);
        Person person = new Person("Maks", dog);

        personRepository.create(person);
        Person read = personRepository.read();
        System.out.println(read);
    }
}