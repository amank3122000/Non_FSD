package Upskilling;

import java.util.Scanner;

public class Q12 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 0;
        int i = 1;
        do {
            f=f+i;
            i++;
        } while (i<=n);
        System.out.println(f);
    }
}
