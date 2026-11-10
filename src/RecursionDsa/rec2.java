package RecursionDsa;

import java.util.Scanner;

public class rec2 {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        fun(n);
    }
    static void fun(int n){
        if(1>n) {
            return;
        }
        fun(n-1);
        System.out.print(n+" ");//head recursion
    }
}
