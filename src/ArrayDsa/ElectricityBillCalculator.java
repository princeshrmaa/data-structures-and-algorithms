package ArrayDsa;

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a < 0){
            System.out.println("Invalid Units");
        }
        if(a>=0&&a<=100){
            System.out.println(a*5);
        }
        else if(a>=101&&a<=200){
            System.out.println((a-100)*7+500);
        }
        else if(a>=201&&a<=300){
            System.out.println((a-200)*10+500+700);
        }
        else {
            System.out.println((a-300)*12+500+700+1000);
        }
        sc.close();
    }
}
