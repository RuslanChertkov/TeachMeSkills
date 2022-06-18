package Employee;

import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private double experience;

    public Employee() {
    }

    public Employee(String name, double salary, double experience){
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Double.compare(employee.experience, experience) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, experience);
    }
}
