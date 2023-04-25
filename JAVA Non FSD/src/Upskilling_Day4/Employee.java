package Upskilling_Day4;

import java.util.Objects;

public class Employee {
    private String name;
    private int empId;
    private long sal;

    public Employee() {
    }

    public Employee(String name, int empId, long sal) {
        this.name = name;
        this.empId = empId;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public long getSal() {
        return sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", sal=" + sal +
                '}';
    }
}
