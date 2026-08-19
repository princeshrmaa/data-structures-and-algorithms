package Stringdsa;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s=s.toLowerCase();
        int vowelcount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vowelcount++;
            }
        }
        System.out.println(vowelcount);
    }
}
