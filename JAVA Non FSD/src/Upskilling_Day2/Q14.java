package Upskilling_Day2;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter length of array: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int min=a[1];
        int max=a[1];
        for (int i=0; i<n; i++) {
            if (a[i]>max) {
                max=a[i];
            }
        }
        System.out.println("Maximum value is: " + max);

        for (int i=0; i<n; i++) {
            if (a[i]<min) {
                min=a[i];
            }
        }
        System.out.println("Minimum value is: " + min);
    }
}
