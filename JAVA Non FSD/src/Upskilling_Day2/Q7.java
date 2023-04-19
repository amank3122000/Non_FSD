package Upskilling_Day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q7 {
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
        Arrays.sort(a);
        Set<Integer> norep = new HashSet<>();
        for (int i=0; i<n; i++) {
            norep.add(a[i]);
        }
        Set<Integer> dup = new HashSet<>();
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (a[i]==a[j]) {
                    dup.add(a[i]);
                }
            }
        }
        System.out.println("Duplicate elements are: " + dup);
        int[] temp = new int[n];
        int j=0;
        for (int i=0; i<n-1; i++) {
            if (a[i] != a[i+1]) {
                temp[j++]=a[i];
            }
        }
        System.out.println("Array after deletion is: ");
        temp[j++]=a[n-1];
        for (int i=0; i<norep.size(); i++) {
            a[i]=temp[i];
            System.out.print(a[i] +" ");
        }
    }
}
