package ArrayDsa;

import java.util.Scanner;

public class CountNegPosAndZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int count=0;
        int count2=0;
        int count3=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                count++;
            }
            else if(nums[i]<0){
                count2++;
            }
            else{
                count3++;
            }
        }
        System.out.println("Postive: "+count);
        System.out.println("Negative: "+count2);
        System.out.println("Zero: "+count3);
    }
}
