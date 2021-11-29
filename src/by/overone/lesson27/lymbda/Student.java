package by.overone.lesson27.lymbda;

import java.util.Objects;

public class Student {
    private String name;
    private Integer course;
    private Double averageMark;

    public Student(String name, Integer course, Double averageMark) {
        this.name = name;
        this.course = course;
        this.averageMark = averageMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(Double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(course, student.course) && Objects.equals(averageMark, student.averageMark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course, averageMark);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", averageMark=" + averageMark +
                '}';
    }
}
