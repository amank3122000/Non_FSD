package Upskilling_Day2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q5 {
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
        Set<Integer> repeat = new HashSet<>();
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (a[i]==a[j]) {
                    repeat.add(a[i]);
                }
            }
        }
        System.out.println("No. of repeated elements are: " + repeat.size());
    }
}
