package Codeforces;

import java.util.Scanner;

public class Translation {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s=sc.next();
       String t=sc.next();
       if(s.length()!=t.length()){
           System.out.println("NO");
           return;
       }
       int a=t.length()-1;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)!=t.charAt(a)){
               System.out.println("NO");
               return;
           }
           a--;
       }
       System.out.println("YES");
    }
}
