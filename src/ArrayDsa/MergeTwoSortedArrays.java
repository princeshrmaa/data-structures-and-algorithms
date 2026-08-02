package ArrayDsa;

import static java.io.ObjectInputFilter.merge;

public class MergeTwoSortedArrays {
    public static void main() {
        int a[]={2,5,6,9,20};
        int b[]={1,3,4,5,7,8};
        int c[]=new int[11];
        merge(c,a,b);
        for(int ele:c){
            System.out.print(ele+" ");
        }
    }

    public static void merge(int[] c, int[] a, int[] b) {
        int i=0;int j=0;int k=0;
     while(i<a.length&&j<b.length) {
         if(a[i]<b[j]){
             c[k++]=a[i++];
         }
         else{
             c[k++]=b[j++];
         }
         if(i==a.length){
             while(j<b.length){
                 c[k++]=b[j++];
             }
         }
         else{
             while(i<a.length){
                 c[k++]=a[i++];
             }
         }
     }
    }
}
