package Stringdsa;

import java.util.Scanner;

public class CheckPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        String a =sc.nextLine();
        System.out.println(s.startsWith(a));
    }
}
