package Upskilling_Day2;

import java.util.Scanner;

public class Q6 {
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
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (a[i] > a[j]) {
                    a[i] = a[j]+a[i];
                    a[j] = a[i]-a[j];
                    a[i] = a[i]-a[j];
                }
            }
            System.out.println(a[i]);
        }
    }
}
