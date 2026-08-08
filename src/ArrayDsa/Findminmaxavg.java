package ArrayDsa;

import java.util.Scanner;

public class Findminmaxavg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        int sum=0;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
            sum=sum+arr[i];
        }
        System.out.println("The maximum marks is :- "+max);
        System.out.println("The minimum marks is :- "+min);
        System.out.println("The Average marks is :- "+(double)sum/n);
        System.out.println("Value to search");
        int val=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val) {
                count++;
            }
        }
        if(count>0){
            System.out.println("Found"+" "+count+" "+"times");
        }
        else{
            System.out.println("Not found");
        }
    }
}
