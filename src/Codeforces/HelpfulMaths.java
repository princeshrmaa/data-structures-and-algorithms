package Codeforces;
import java.util.Arrays;
import java.util.Scanner;
public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int n = (a.length() / 2) + 1;
        int arr[] = new int[n];
        int c = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != '+') {
                arr[c] = a.charAt(i) - '0';
                c++;
            }
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + "+");
            } else {
                System.out.print(arr[i]);
            }
        }
    }
}
