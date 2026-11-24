package Codeforces;

import java.util.Scanner;

public class GamewithIntegers {
   public static void main(String[] args) {
       Scanner sc  = new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=0;i<n;i++){
           int a=sc.nextInt();
           if(a%3==0||a%3==1){
               System.out.println("First");
           }
           else{
               System.out.println("Second");
           }
       }
    }
}
