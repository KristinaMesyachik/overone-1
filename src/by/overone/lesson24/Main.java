package by.overone.lesson24;

public class Main {
    static class A {} // вложенный
    class B{} // внутренний
    public void foo(){
       class C{} // локальный
    }
}
