package ArrayDsa;

import java.util.Scanner;

public class SecondSmallestEle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    int min2 = Integer.MAX_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if (min > arr[i]) {
            min = arr[i];
        }
    }
    for(int i=0;i<arr.length;i++){
        if(arr[i] < min2 && arr[i]!= min){
            min2=arr[i];
        }
    }
    System.out.println("The second largest ele of array is "+min2);
}
}
