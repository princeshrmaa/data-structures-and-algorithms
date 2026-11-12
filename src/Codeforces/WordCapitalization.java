package Codeforces;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s=sc.next();
      String a="";
      for(int i=0;i<s.length();i++){
          if(i==0 && s.charAt(i)>=97 && s.charAt(i)<=122){
              a+=(char)(s.charAt(0)-32);
          }
          else{
              a+=s.charAt(i);
          }
      }
        System.out.println(a);
    }
}
