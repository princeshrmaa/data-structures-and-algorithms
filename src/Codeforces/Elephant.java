package Codeforces;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        while(a!=0){
            if(a>=5){
                a=a-5;
                c++;
            }
            if(a>=4){
                a=a-4;
                c++;
            }
            if(a>=3){
                a=a-3;
                c++;
            }
            if(a>=2){
                a=a-2;
                c++;
            }
            if(a>=1){
                a=a-1;
                c++;
            }
        }
        System.out.println(c);
    }
}
