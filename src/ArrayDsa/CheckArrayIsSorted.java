package ArrayDsa;

import java.util.Scanner;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                System.out.println("Not sorted");
                return;
            }
        }
        System.out.println("Sorted");
    }
}