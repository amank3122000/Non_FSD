package Upskilling_Day2;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, s=0, l, d=0, t;
        n = sc.nextInt();
        t=n;
        while (t>0) {
            t=t/10;
            d++;
        }
        t=n;
        while (t>0) {
            l=t%10;
            s+=Math.pow(l,d);
            t=t/10;
        }
        if (s==n) {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
