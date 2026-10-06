package Stringdsa;

import java.util.Scanner;

public class SimulateStringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int count=1;
        String a="";
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i))count++;
            else if(s.charAt(i-1)!=s.charAt(i)){
                a=a+s.charAt(i-1)+count;
                count=1;
            }
        }
        a=a+s.charAt(s.length()-1)+count;
        System.out.println(a);
    }
}
