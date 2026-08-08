package ArrayDsa;

import java.util.Scanner;

public class CountOccurence {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int nums[]=new int[n];
       for(int i=0;i<nums.length;i++){
           nums[i]=sc.nextInt();
       }
       System.out.println("Enter the number to be count: ");
       int a=sc.nextInt();
       int count=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]==a){
               count++;
           }
       }
       System.out.println("the num appears in array "+count+" times");
    }
}
