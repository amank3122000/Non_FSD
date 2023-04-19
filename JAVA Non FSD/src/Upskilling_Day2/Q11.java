package Upskilling_Day2;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, f, count=0;
        System.out.println("Enter length of array: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter element to be searched: ");
        f = sc.nextInt();
        for (int i=0; i<n; i++) {
            if (f==a[i]) {
                count++;
            }
        }
        System.out.println("The element " + f + " occured " + count + " times.");
    }
}
