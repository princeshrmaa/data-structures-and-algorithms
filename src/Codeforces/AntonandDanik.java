package Codeforces;

import java.util.Scanner;

public class AntonandDanik {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.next();
       int a=0;
       int d=0;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='a')a++;
           else if(s.charAt(i)=='d')d++;
       }
       if(a>d){
           System.out.println("Anton");
       }
       else if(a<d){
           System.out.println("Danik");
       }
       else if(a==d){
           System.out.println("Friendship");
       }
    }
}
