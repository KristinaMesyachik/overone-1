package by.overone.lesson27.lymbda;

import java.util.List;
import java.util.function.Predicate;

public class StudentInfo {

    public void testStudents(List<Student> studentList, Predicate<Student> predicate) {
        for (Student student : studentList) {
            if (predicate.test(student)) {
                System.out.println(student);
            }
        }
    }

    public void printStudentsOverGrade(List<Student> studentList, double grade) {
        for (Student student : studentList) {
            if (student.getAverageMark() > grade) {
                System.out.println(student);
            }
        }
    }

    public void printStudentsUnderCourse(List<Student> studentList, int course) {
        for (Student student : studentList) {
            if (student.getCourse() < course) {
                System.out.println(student);
            }
        }
    }
}
