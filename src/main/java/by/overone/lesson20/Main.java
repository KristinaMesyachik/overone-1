package by.overone.lesson20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Oleg");
        names.add("Petr");
//        names.remove(0);
//        System.out.println(names.isEmpty());
//        names.clear();
//        System.out.println(names.isEmpty());
//        System.out.println(names.contains("Ivan"));
//        System.out.println(names.contains("Sasha"));
//        System.out.println(names.indexOf("Sasha"));
//        System.out.println(names.get(names.indexOf("Ivan")));
//        Object[] objects1 = names.toArray();
//        String[] strings1 = names.toArray(new String[200]);
//        for (String s : strings1) {
//            System.out.println(s);
//        }
        List<String> objects1 = new ArrayList<>();
        objects1.add("One");
        objects1.add("Two");
        objects1.add("Three");
        objects1.add("Four");
        objects1.add("Five");


        ListIterator<String> stringListIterator = objects1.listIterator(objects1.size());
        while (stringListIterator.hasPrevious()){
            System.out.println(stringListIterator.previous());
        }

//        ArrayList<String> strings = new ArrayList<>(names);
//        System.out.println(strings);

//        ArrayList<Object> objects = new ArrayList<>(200);
    }
}
