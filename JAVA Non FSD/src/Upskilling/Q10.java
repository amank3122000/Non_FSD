package Upskilling;

import java.util.Scanner;

public class Q10 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1,c=0;

        while (i<=n) {
            if (n%i==0)
                c++;
                i++;

        }
        if (c>2)
        {
            System.out.println("Not Prime");
        }
        else if (c==2) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Neither prime nor composite");
        }
    }
}
