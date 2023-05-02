package Upskilling_Day4;

import java.util.Arrays;

public class Student {
    private String name;
    private int rollNo;
    private int[] marks;

    public Student() {
    }

    public Student(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public float avg(int[] marks) {
        float total = 0;
        for (int i=0; i<marks.length; i++) {
            total += marks[i];
        }
        return total/marks.length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
