package Upskilling;

import java.util.Scanner;

public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>b) {
            System.out.println("Greater");
        }
        else if (a<b) {
            System.out.println("Smaller");
        }
        else {
            System.out.println("Equals");
        }

    }
}
