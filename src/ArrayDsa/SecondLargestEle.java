package ArrayDsa;

import java.util.Scanner;

public class SecondLargestEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max2 = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max2&&arr[i]!=max){
                max2=arr[i];
            }
        }
        System.out.println("The second largest ele of array is "+max2);
    }
}
