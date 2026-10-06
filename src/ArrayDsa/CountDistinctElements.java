package ArrayDsa;

import java.util.Scanner;

public class CountDistinctElements {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
     }
     int freq[]=new int[n+1];
     for(int i=0;i<arr.length;i++){
         freq[arr[i]]++;
     }
     int c=0;
     for(int i=0;i<freq.length;i++){
         if(freq[i]>0){
                 c++;
         }
     }
        System.out.println(c);
    }
}
