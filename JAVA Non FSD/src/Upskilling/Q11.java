package Upskilling;

import java.util.Scanner;

public class Q11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        while(a+b<n) {
            b=a+b;
            a=b-a;
            System.out.println(b);
        }
    }
}
