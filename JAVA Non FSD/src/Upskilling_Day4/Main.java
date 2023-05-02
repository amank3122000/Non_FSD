package Upskilling_Day4;

import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        BankAccount ba = new BankAccount();
//        ba.setAccNo(1234567890);
//        ba.setName("Aman");
//        ba.setBalance(20000);
//        ba.deposit(4000);
//        ba.withdrawl(25000);
//        ba.withdrawl(3000);
//
//
//        List<Employee> employees = new ArrayList<>();
//        Employee e1 = new Employee("Aman",123, 40000);
//        Employee e2 = new Employee("Kumar", 456, 30000);
//        Employee e3 = new Employee("Ayush", 789, 50000);
//        Employee e4 = new Employee("Ram", 234, 100000);
//        Employee e5 = new Employee("Manish", 567, 45000);
//        employees.add(e1);
//        employees.add(e2);
//        employees.add(e3);
//        employees.add(e4);
//        employees.add(e5);
//        Employee h1 = null, h2 = null, h3 = null;
//        for (Employee employee : employees) {
//            if (h1 == null || employee.getSal() > h1.getSal()) {
//                h3 = h2;
//                h2 = h1;
//                h1 = employee;
//            } else if (h2 == null || employee.getSal() > h2.getSal()) {
//                h3 = h2;
//                h2 = employee;
//            } else if (h3 == null || employee.getSal() > h3.getSal()) {
//                h3 = employee;
//            }
//        }
//        System.out.println("Top 3 highest-paid employees are: ");
//        System.out.println(h1.toString());
//        assert h2 != null;
//        System.out.println(h2.toString());
//        assert h3 != null;
//        System.out.println(h3.toString());


        Car car = new Car() {
            public void show (Car car){
                System.out.println("Make: " + car.getMake() +
                        " -> Model: " + car.getModel());
            }
        };

        Car car1 = new Car("BMW", "X7", 2002);
        Car car2 = new Car("Audi", "R8", 2004);
        Car car3 = new Car("Honda", "Civic", 2000);
        Car car4 = new Car("MG", "Hector", 2012);
        Car car5 = new Car("Lamborghini", "Urus", 2005);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        for (int i=0; i<5; i++) {
            car.show(cars.get(i));
        }


//        Person person = new Person();
//        List<Person> persons = new ArrayList<>();
//        Person person1 = new Person("Aman", 22, "Male");
//        Person person2 = new Person("Kumar", 17, "Male");
//        Person person3 = new Person("Manish", 24, "Male");
//        Person person4 = new Person("Rishav", 52, "Male");
//        Person person5 = new Person("Ayush", 12, "Male");
//        Person person6 = new Person("Soumya", 58, "Male");
//        Person person7 = new Person("Shubhro", 35, "Male");
//        Person person8 = new Person("Gargi", 50, "Female");
//        Person person9 = new Person("Raunak", 7, "Male");
//        Person person10 = new Person("Sanchit", 20, "Male");
//        persons.add(person1);
//        persons.add(person2);
//        persons.add(person3);
//        persons.add(person4);
//        persons.add(person5);
//        persons.add(person6);
//        persons.add(person7);
//        persons.add(person8);
//        persons.add(person9);
//        persons.add(person10);
//        person.eligibility(person5);
//        person.eligibility(person4);
//        System.out.println("People eligible to vote are: ");
//        for (int i=0; i<10; i++) {
//            if (persons.get(i).getAge()>=18) {
//                System.out.println(persons.get(i).getName());
//            }
//        }
//
//
//        Rectangle rec = new Rectangle();
//        List<Rectangle> rectangles= new ArrayList<>();
//        Rectangle rec1 = new Rectangle(10,12);
//        Rectangle rec2 = new Rectangle(15,4);
//        Rectangle rec3 = new Rectangle(8,6);
//        Rectangle rec4 = new Rectangle(12,14);
//        Rectangle rec5 = new Rectangle(15,9);
//        rectangles.add(rec1);
//        rectangles.add(rec2);
//        rectangles.add(rec3);
//        rectangles.add(rec4);
//        rectangles.add(rec5);
//
//        System.out.println("Area of rec2 is: " + rec.area(rec2));
//        System.out.println("Perimeter of rec4 is: " + rec.perimeter(rec4));
//        Rectangle aMax = new Rectangle(0,0);
//
//        for(Rectangle rectangle : rectangles) {
//            if (rec.area(rectangle)>=rec.area(aMax)) {
//                aMax=rectangle;
//            }
//        }
//        System.out.println("Length: " + aMax.getLength() + " ; " +  "Breadth: " + aMax.getBreadth());
//
//
//        Animal animal = new Animal();
//        List<Animal> animals = new ArrayList<>();
//        Animal animal1 = new Animal("Lion", "wild");
//        Animal animal2 = new Animal("Cheetah", "Wild");
//        Animal animal3 = new Animal("Cow", "domestic");
//        Animal animal4 = new Animal("Cat", "Domestic");
//        Animal animal5 = new Animal("Bear", "Wild");
//        animals.add(animal1);
//        animals.add(animal2);
//        animals.add(animal3);
//        animals.add(animal4);
//        animals.add(animal5);
//
//        animal.check(animal3);
//        animal.check(animal5);
//        System.out.println("Domestic animals are: ");
//        for (int i=0; i<5; i++) {
//            if(animals.get(i).getType().equalsIgnoreCase("domestic")) {
//                System.out.println(animals.get(i).getName());
//            }
//        }
//
//
//        Shape shape = new Shape();
//        List<Shape> shapes = new ArrayList<>();
//        Shape shape1 = new Shape("Square", "Red");
//        Shape shape2 = new Shape("Triangle", "Blue");
//        Shape shape3 = new Shape("Circle", "White");
//        Shape shape4 = new Shape("Circle", "Yellow");
//        Shape shape5 = new Shape("Triangle", "Green");
//        shapes.add(shape1);
//        shapes.add(shape2);
//        shapes.add(shape3);
//        shapes.add(shape4);
//        shapes.add(shape5);
//        HashMap<String, Integer> count = new HashMap();
//
//        for (int i=0; i<5; i++) {
//                if(count.containsKey(shapes.get(i).getType())) {
//                    count.put(shapes.get(i).getType(), count.get(shapes.get(i).getType())+1);
//                }
//                else {
//                    count.put(shapes.get(i).getType(),1);
//                }
//        }
//        System.out.println(count);
//
//
//        Student student = new Student();
//        List<Student> students = new ArrayList<>();

    }
}
