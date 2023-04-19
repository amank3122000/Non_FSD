package Upskilling_Day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.println("Enter length of array 1: ");
        n = sc.nextInt();
        System.out.println("Enter length of array 2: ");
        m = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements of array 1: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[m];
        System.out.println("Enter elements of array 2: ");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Set<Integer> com = new HashSet<>();
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (a[i]==b[j]) {
                    com.add(a[i]);
                }
            }
        }
        System.out.println("The common elements in both sorted arrays are: " + com);
    }
}
