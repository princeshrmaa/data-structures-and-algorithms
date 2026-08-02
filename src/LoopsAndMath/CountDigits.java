package LoopsAndMath;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        if (n != 0) {
            while (n != 0) {
                int dig = n % 10;
                a++;
                n = n / 10;
            }
            System.out.println(a);
        } else {
            System.out.println(1);
        }
        sc.close();
    }
}
