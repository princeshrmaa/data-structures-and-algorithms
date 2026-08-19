package Stringdsa;

import java.util.Scanner;

public class CheckPalindrome {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = "";
        for(int i=s.length()-1;i>=0;i--){
            a=a+s.charAt(i);
        }
        if(a.equals(s)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
