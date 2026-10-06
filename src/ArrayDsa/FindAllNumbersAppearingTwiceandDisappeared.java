package ArrayDsa;

import java.util.Scanner;

public class FindAllNumbersAppearingTwiceandDisappeared {
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
            if(freq[i]==2){
                System.out.println("appearing twice"+ i);
            }
            else if(freq[i]==0){
                System.out.println("Missing value"+ i);
            }
        }
    }
}
