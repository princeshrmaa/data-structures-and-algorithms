package LoopsAndMath;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max=0;
        for(int i=1;i<=Math.min(a, b);i++){
            if(a%i==0&&b%i==0){
                if(i>max){
                    max=i;
                }
            }
        }
        System.out.println((a*b)/max);
        sc.close();
    }
}
