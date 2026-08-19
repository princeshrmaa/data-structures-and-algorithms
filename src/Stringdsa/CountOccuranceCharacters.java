package Stringdsa;

import java.util.Scanner;

public class CountOccuranceCharacters {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       int count=0;
       char ch = sc.nextLine().charAt(0);
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)==ch){
               count++;
           }
       }
       System.out.println(count);

    }
}
