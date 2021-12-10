package by.overone.lesson21;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Employee ivan = new Employee(0l, "Ivan", 100);
        Employee boris = new Employee(1l, "Boris", 300);
        Employee maksim = new Employee(2l, "Maksim", 600);

        TreeSet<Employee> employees = new TreeSet<>();
        employees.add(boris);
        employees.add(maksim);
        employees.add(ivan);

        System.out.println(employees);
//
//
//        HashSet<Employee> employees1 = new HashSet<>();
//        employees1.add(ivan);
//        employees1.add(boris);
//        employees1.add(maksim);
//
//        HashSet<Employee> employees2 = new HashSet<>();
//
//        Employee ivan2 = new Employee(0L, "Ivan", 100);
//        Employee olga = new Employee(4L, "Volha", 30000);
//        Employee arina = new Employee(5L, "Arina", 60000);
//        employees2.add(ivan2);
//        employees2.add(olga);
//        employees2.add(arina);

//        employees1.addAll(employees2);
//        System.out.println(employees1);

//        employees1.retainAll(employees2);
//        System.out.println(employees1);

//        employees1.removeAll(employees2);
//        System.out.println(employees1);

//        System.out.println(employees1.size());
//        System.out.println(employees1.contains(ivan2));

//        TreeSet<Integer> numbers = new TreeSet<>();
//        numbers.add(10);
//        numbers.add(5);
//        numbers.add(0);
//        System.out.println(numbers);


    }
}

class Employee implements Comparable<Employee> {
    private Long id;
    private String name;
    private Integer salary;

    public Employee(Long id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(salary, employee.salary) && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmployee) {
        return this.salary.compareTo(anotherEmployee.salary);
    }
}

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary().compareTo(o2.getSalary());
    }
}


