package Codeforces;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s=sc.next();
       int l=0;
       int u=0;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)>=97&&s.charAt(i)<=122){
               l++;
           }
           else{
               u++;
           }
       }
       if(l>=u){
           System.out.println(s.toLowerCase());
           return;
       }
        System.out.println(s.toUpperCase());
    }
}
