package RecursionDsa;

import java.util.Scanner;

public class rec1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(n,1);
    }
    static void fun(int n,int i){
        if(i>n)return;
        System.out.print(i+" ");
        fun(n,i+1);
    }
}
