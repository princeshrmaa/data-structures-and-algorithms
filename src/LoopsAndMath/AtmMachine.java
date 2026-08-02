package LoopsAndMath;

import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = sc.nextInt();
        int withdraw = sc.nextInt();

        if (withdraw <= 0 || withdraw % 100 != 0) {
            System.out.println("Invalid Amount");
        }
        else if (withdraw > balance) {
            System.out.println("Insufficient Balance");
        }
        else {
            System.out.println("Remaining Balance: " + (balance - withdraw));
        }

        sc.close();
    }
}
