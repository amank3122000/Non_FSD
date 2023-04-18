package Upskilling;

public class Q2 {
    public static void main(String args[]) {
        String s = "432";
        int a = 1234;
        double d = 123456.789;

        String a1 = Integer.toString(a);
        System.out.println(a1);

        int s1 = Integer.parseInt(s);
        System.out.println(s1);

        int d1 = (int)d;
        System.out.println(d1);

        Double s2 = Double.valueOf(s);
        System.out.println(s2);

    }
}
