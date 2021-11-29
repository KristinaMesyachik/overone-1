package by.overone.lesson27.lymbda;

public class StudentAverageMarkCheck implements StudentCheck {
    @Override
    public boolean check(Student student) {
        return student.getAverageMark() > 7;
    }
}
