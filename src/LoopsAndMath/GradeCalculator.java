package LoopsAndMath;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a >= 90 && a <= 100){
            System.out.println("A");
        }
        else if(a >= 80 && a <= 89){
            System.out.println("B");
        }
        else if(a >= 70 && a <= 79){
            System.out.println("C");
        }
        else if(a >= 60 && a <= 69) {
            System.out.println("D");
        }
        else if(a >= 0 && a <= 59) {
            System.out.println("F");
        }
        else{
            System.out.println("Invalid marks");
        }
        sc.close();
    }
}
