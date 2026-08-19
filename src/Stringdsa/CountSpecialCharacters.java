package Stringdsa;

import java.util.Scanner;

public class CountSpecialCharacters {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        String s = sc.nextLine();
        s=s.toLowerCase();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='0'&&s.charAt(i)<='9'){
                c++;
            }
        }
        System.out.println(s.length()-c);
    }
}
