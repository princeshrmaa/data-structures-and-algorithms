package ArrayDsa;

import java.util.Scanner;

public class Mergesortedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int arr2[]= new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        int arr3[]=new int[m+n];
        int a=0;
        int b=0;
        int i=0;
        while(a<n&&b<m){
            if(arr[a]<arr2[b]){
                arr3[i++]=arr[a];
                a++;
            }
            else if(arr[a]>arr2[b]){
                arr3[i++]=arr2[b];
                b++;
            }
            else {
                arr3[i++] = arr[a];
                a++;
            }
        }
        while(a<n){
            arr3[i++]=arr[a++];
        }
        while(b<m){
            arr3[i++]=arr2[b++];
        }
        for(int c=0;c<arr3.length;c++){
            System.out.print(arr3[c]+" ");
        }
    }
}
