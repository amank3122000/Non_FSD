package Upskilling_Day2;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter length of array: ");
        n = sc.nextInt();
        int[] a = new int[n];
        int[] b;
        System.out.println("Enter elements of array: ");
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        b=a.clone();
        for (int i=0; i<n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
