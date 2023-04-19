package Upskilling_Day2;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        //int[] a = {2,4,3,1,5};
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter length of array: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        printSum(a);
    }
    public static void printSum(int[] a) {
        int sum = 0;
        for (int i = 0; i<a.length; i++) {
            sum += a[i];
        }
        System.out.println("Sum of array is: " + sum);
    }
}
