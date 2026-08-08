package ArrayDsa;

import java.util.Scanner;

public class CountEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("The even count is " + count);
        System.out.println("The Odd count is " + (n - count));
    }
}
