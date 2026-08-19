package Stringdsa;

import java.util.Scanner;

public class CountUpperLower {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       int a=0;
       int b=0;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
               a++;
           }
           else if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
               b++;
           }
       }
       System.out.println("Uppercase : "+b);
       System.out.println("Lowercase: "+a);
    }
}
