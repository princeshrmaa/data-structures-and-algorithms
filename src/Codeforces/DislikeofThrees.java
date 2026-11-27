package Codeforces;

import java.util.Scanner;

public class DislikeofThrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int j=0;j<t;j++){
            int n=sc.nextInt();
            int count=0;
            int i=1;

            while(count!=n){
                if(i%3!=0 && i%10!=3){
                    count++;
                }
                if(count!=n){
                    i++;
                }
            }
            System.out.println(i);
        }
    }
}

