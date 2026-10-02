package ArrayDsa;
import java.util.Scanner;
public class LeftRotateByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            rotate(arr1);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
    static void rotate(int arr1[]) {
        Scanner sc = new Scanner(System.in);
        int a = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            arr1[i - 1] = arr1[i];
        }
        arr1[arr1.length - 1] = a;
    }
}

