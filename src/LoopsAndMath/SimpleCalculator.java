package LoopsAndMath;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        char c = sc.next().charAt(0);
        if(c=='+'){
            System.out.println(a+b);
        }
        else if(c=='-'){
            System.out.println(a-b);
        }
        else if(c=='*'){
            System.out.println(a*b);
        }
        else if(c=='/'){
            if(b==0){
                System.out.println("Cannot be divisible by zero");
            }
            else{
                System.out.println(a/b);
            }
        }
        else if(c=='%'){
            if(b==0){
                System.out.println("Cannot be divisible by zero");
            }
            else{
            System.out.println(a%b);
        }}
        else{
            System.out.println("Invalid operator");
        }
        sc.close();
    }
}
