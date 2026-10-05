package ArrayDsa;

import java.util.Scanner;

public class ShiftAllNegativeNumberstoLeft {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
         int arr[]= new int[n];
         for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
         }
         int st=0;
         for(int i=0;i<n;i++){
             if(arr[i]<0){
                 int temp=arr[i];
                 arr[i]=arr[st];
                 arr[st]=temp;
                 st++;
             }
         }
         for(int i=0;i<n;i++){
             System.out.print(arr[i]+" ");
         }
    }
}
