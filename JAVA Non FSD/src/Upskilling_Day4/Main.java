package Upskilling_Day4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        ba.setAccNo(1234567890);
        ba.setName("Aman");
        ba.setBalance(20000);
        ba.deposit(4000);
        ba.withdrawl(25000);
        ba.withdrawl(3000);


        List<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee("Aman",123, 40000);
        Employee e2 = new Employee("Kumar", 456, 30000);
        Employee e3 = new Employee("Ayush", 789, 50000);
        Employee e4 = new Employee("Ram", 234, 100000);
        Employee e5 = new Employee("Manish", 567, 45000);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        Employee h1 = null, h2 = null, h3 = null;
        for (Employee employee : employees) {
            if (h1 == null || employee.getSal() > h1.getSal()) {
                h3 = h2;
                h2 = h1;
                h1 = employee;
            } else if (h2 == null || employee.getSal() > h2.getSal()) {
                h3 = h2;
                h2 = employee;
            } else if (h3 == null || employee.getSal() > h3.getSal()) {
                h3 = employee;
            }
        }
        System.out.println("Top 3 highest-paid employees are: ");
        System.out.println(h1.toString());
        assert h2 != null;
        System.out.println(h2.toString());
        assert h3 != null;
        System.out.println(h3.toString());


        List<Car> cars = new ArrayList<>();
        Car car1 = new Car("BMW", "X7", 2002);
        Car car2 = new Car("Audi", "R8", 2004);
        Car car3 = new Car("Honda", "Civic", 2000);
        Car car4 = new Car("MG", "Hector", 2012);
        Car car5 = new Car("Lamborghini", "Urus", 2005);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        for (int i=0; i<5; i++) {
            System.out.println(cars.get(i).toString());
        }

        Person person = new Person();
        List<Person> persons = new ArrayList<>();
        Person person1 = new Person("Aman", 22, "Male");
        Person person2 = new Person("Kumar", 17, "Male");
        Person person3 = new Person("Manish", 24, "Male");
        Person person4 = new Person("Rishav", 52, "Male");
        Person person5 = new Person("Ayush", 12, "Male");
        Person person6 = new Person("Soumya", 58, "Male");
        Person person7 = new Person("Shubhro", 35, "Male");
        Person person8 = new Person("Gargi", 50, "Female");
        Person person9 = new Person("Raunak", 7, "Male");
        Person person10 = new Person("Sanchit", 20, "Male");
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);
        persons.add(person9);
        persons.add(person10);
        person.eligibility(person5);
        person.eligibility(person4);
        System.out.println("People eligible to vote are: ");
        for (int i=0; i<10; i++) {
            if (persons.get(i).getAge()>=18) {
                System.out.println(persons.get(i).getName());
            }
        }


    }
}
