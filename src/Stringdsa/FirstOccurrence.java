package Stringdsa;

import java.util.Scanner;

public class FirstOccurrence {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       char ch = sc.nextLine().charAt(0);
           System.out.println(s.indexOf(ch));
    }
}
