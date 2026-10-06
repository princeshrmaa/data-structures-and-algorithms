package Stringdsa;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String a="";
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)!=s.charAt(i)){
                a+=s.charAt(i-1);
            }
        }
        a+=s.charAt(s.length()-1);
        System.out.println(a);
    }
}
