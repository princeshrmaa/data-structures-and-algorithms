package ArrayDsa;

import java.util.Scanner;

public class FirstOccuranceOfTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter num: ");
        int a=sc.nextInt();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==a){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
