package Codeforces;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=0;i<n;i++){
          String s=sc.next();
          if(s.length()<=10){
              System.out.println(s);
          }
          else{
          String a="";
          int c=s.length()-2;
          a+=s.charAt(0);
          a+=c;
          a+=s.charAt(s.length()-1);
          System.out.println(a);}
      }
    }
}
