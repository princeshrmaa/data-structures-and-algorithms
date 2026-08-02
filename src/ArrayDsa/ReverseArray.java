package ArrayDsa;

public class ReverseArray {
    static void main() {
        int[] arr={3,19,56,9,83,18,24,85,14};
        int n=arr.length;
        int i=2;
        int j=n-4;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int p=0;p<n;p++){
            System.out.print(arr[p]+" ");
        }
    }
}
