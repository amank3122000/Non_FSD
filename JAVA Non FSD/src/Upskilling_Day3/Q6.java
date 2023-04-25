package Upskilling_Day3;

public class Q6 {
    public Q6() {
        super();
        System.out.println("In Parent Class");
    }
    public Q6(int n) {
        super();
        System.out.println("In Parent Class Parametrized");
    }

    public int add(int n1, int n2) {
        System.out.println("Add");
        return n1+n2;
    }
    public int sub(int n1, int n2) {
        System.out.println("Subtract");
        return n1-n2;
    }

}
class Q6E extends Q6 {
    public Q6E() {
        super();
        System.out.println("In Child Class");
    }
    public Q6E(int n) {
        super(n);
        System.out.println("In Child Class Parametrized");
    }

    public int mul(int n1, int n2) {
        System.out.println("Multiply");
        return n1*n2;
    }
    public int div(int n1, int n2) {
        System.out.println("Divide");
        return n1/n2;
    }
}
class Q6EE extends Q6E {
    public Q6EE() {
        System.out.println("In Grandchild Class");
    }

    public Q6EE(int n) {
        super(n);
    }
    public int pow(int n1, int n2) {
        System.out.println("Power");
        return (int)Math.pow(4,2);
    }
}
