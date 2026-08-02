package LoopsAndMath;

import java.util.Scanner;

public class PowOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int result=1;
        if(a==0){
            System.out.println(1);
        }
        else{
        for(int i=0;i<a;i++){
            result=result*n;
        }
            System.out.println(result);}
        sc.close();
    }
}
