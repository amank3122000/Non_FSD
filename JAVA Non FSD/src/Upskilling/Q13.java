package Upskilling;

import java.util.Scanner;

public class Q13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        for (int i=str.length()-1; i>=0; i--) {
            System.out.print(ch[i]);
        }
    }
}
