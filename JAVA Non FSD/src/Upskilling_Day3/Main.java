package Upskilling_Day3;

public class Main {
    public static void main(String[] args) {
        Q1 q1 = new Q1("Kumar", 75);
        System.out.println(q1.getName() + " : " + q1.getMarks());

        Q2 q2 = new Q2();
        q2.setMarks(80);
        q2.setName("Aman");
        System.out.println(q2.getName() + " : " + q2.getMarks());

        Q6E q6e = new Q6E();
        q6e.mul(4,3);
        q6e.add(3,4);

        Q6E q6e2 = new Q6E(5);
        new Q6().add(7,4);

        Q6EE q6ee = new Q6EE();
        q6ee.pow(4,2);
    }
}
