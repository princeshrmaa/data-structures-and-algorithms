package Codeforces;

import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n!=0){
            int dig=n%10;
            if(dig==4||dig==7){
                c++;
            }
            n=n/10;
        }
        if(c==4||c==7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
