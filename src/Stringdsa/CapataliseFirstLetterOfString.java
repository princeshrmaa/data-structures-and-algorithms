package Stringdsa;

import java.util.Arrays;
import java.util.Scanner;

public class CapataliseFirstLetterOfString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str="   java     is    my first programming   language";
        str=str.toLowerCase().trim();
        String[] arr=str.split("\\s+");
        //System.out.println(Arrays.toString(arr));
        StringBuilder sb=new StringBuilder();
        for(String s: arr){
            //char ch=(char)(s.charAt(0)-32);
            char ch=Character.toUpperCase(s.charAt(0));
            String s1=s.substring(1);
            sb.append(ch);
            sb.append(s1);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
