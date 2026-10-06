package ArrayDsa;

import java.util.Scanner;

public class FrequenciesofLimitedRangeArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int freq[]=new int[n+1];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        for(int i=1;i<freq.length;i++){
            System.out.println(i + "occurs"+ freq[i] + "times");
        }
    }
}
