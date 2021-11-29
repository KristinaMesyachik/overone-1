package by.overone.lesson27.lymbda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 1, 7.5);
        Student student2 = new Student("Olga", 3, 8.8);
        Student student3 = new Student("Maksim", 2, 9.3);
        Student student4 = new Student("Daria", 4, 7.3);
        Student student5 = new Student("Alex", 3, 6.0);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        students.stream().filter(student -> student.getCourse() > 3).forEach(student -> {
            student.setCourse(5);
            System.out.println(student);
        });

        students.stream()
                .filter(student -> student.getCourse() < 4)
                .map(student -> student.getName().length())
                .forEach(s -> System.out.println(s));

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(1);
        integers.add(2);
        integers.add(2);
        integers.add(3);
        integers.add(3);

        List<Integer> collect = integers.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);

        integers.stream().forEach(A::a);

        Stream<Object> empty = Stream.empty();
        empty.forEach(element -> System.out.println(element));

        StudentInfo studentInfo = new StudentInfo();
        studentInfo.printStudentsOverGrade(students, 7);
        System.out.println("------------------------------------");
        studentInfo.printStudentsUnderCourse(students, 3);

//        studentInfo.testStudents(students, new StudentAverageMarkCheck());
//        studentInfo.testStudents(students, (StudentCheck) student -> student.getCourse() > 2);

        studentInfo.testStudents(students, (Student st) -> {
            return st.getAverageMark() < 8;
        });

        StudentCheck averageMarkCheck = student -> student.getAverageMark() < 8 && student.getCourse() > 2;

//        studentInfo.testStudents(students, averageMarkCheck);

        Predicate<Student> predicate = student -> student.getAverageMark() < 7;
        studentInfo.testStudents(students, predicate);
        System.out.println("-------------------------------------");
        studentInfo.testStudents(students, predicate.negate());
        System.out.println("-------------------------------------");
        studentInfo.testStudents(students, predicate.and(student -> student.getCourse() > 1));
        System.out.println("-------------------------------------");
        studentInfo.testStudents(students, predicate.or(student -> student.getCourse() > 3));
        BinaryOperator<Integer> binaryOperatorSum = (x, y) -> x + y;
        BinaryOperator<Integer> binaryOperator2 = (x, y) -> x - y;
        BinaryOperator<Integer> binaryOperator3 = (x, y) -> x * y;
        BinaryOperator<Integer> binaryOperator4 = (x, y) -> x / y;

        binaryOperatorSum.apply(1, 2);
        binaryOperator2.apply(2, 3);

        Function<String, Integer> function = string -> string.length();
        System.out.println(function.apply("privet"));
        System.out.println(function.apply("poka"));
        System.out.println(function.apply("hi"));

    }

}

class A {
    static void a(Integer integer) {
        System.out.println(integer);
    }
}
