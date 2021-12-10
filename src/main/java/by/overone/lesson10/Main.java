package by.overone.lesson10;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Animal");
//        animal.say();
        sayAnimal(animal);

        Animal cat = new Cat();
        cat.setName("Cat");
//        cat.say();
        sayAnimal(cat);

        Dog dog = new Dog();
        dog.setName("Dog");
//        dog.say();
        sayAnimal(dog);
        System.out.println(dog.getName());
        int b = 3;
    }

    public static void sayAnimal(Animal object) {
        object.setName("NoDog");
//        dog.say();
    }
}
