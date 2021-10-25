package by.overone.lesson14.part1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("Barsik", 15, 1, new Cat("Myrzik"));
        Person personClone = person.clone();
        person.getCat().setName("NewName");
        System.out.println(person);
        System.out.println(personClone);
    }
}
