package RecursionDsa;

import java.util.Scanner;

public class rec2 {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        fun(n,n);
    }
    static void fun(int n,int i){
        if(i==0){
            return;
        }
        System.out.print(i+" ");
        fun(n,i-1);
    }
}
