package Stringdsa;

import java.util.Scanner;

public class LastOccurrence {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       char a=sc.nextLine().charAt(0);
       System.out.println(s.lastIndexOf(a));

    }
}
