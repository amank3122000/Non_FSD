package Upskilling_Day2;

import java.util.Scanner;

public class Q9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i=0; i<n-2; i++) {
            b=a+b;
            a=b-a;
            System.out.println(b);
        }
    }
}
