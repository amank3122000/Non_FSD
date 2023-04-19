package Upskilling_Day2;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter length of array: ");
        n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("The reverse array is: ");
        for (int i=0; i<n; i++) {
            b[i] = a[n-i-1];
            System.out.println(b[i]);
        }
    }
}
