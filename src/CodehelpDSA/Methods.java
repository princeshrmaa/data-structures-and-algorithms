package CodehelpDSA;

public class Methods {
    static void main(String[] args) {
        int num=5;
        System.out.println(num);
        solve(num);
        System.out.println(num);
        int ans1 = add(12,13);
        int ans2 = add(1,2,3);
        System.out.println(ans1);
        System.out.println(ans2);
        multiply(5,15);
        printsum(5,10);
        System.out.println("Hi");
    twoKatable();
        System.out.println("Bye");
    }
    static void printsum(int x,int y){
        System.out.println(x+y);
    }
    static void multiply(int a,int b){
        System.out.println(a*b);
    }
    static int add(int p,int q){
        int sum=p+q;
        return sum;
    }
    static int add(int p,int q,int r){
        int ans=p+q+r;
        return ans;
    }
    static void solve(int num){
        System.out.println(num);
        num=num*10;
        System.out.println(num);
    }
    static void printMultiple(){
        int val=20;
        for(int i=1;i<=10;i++){
            System.out.println(20*i);
        }
    }
    static void twoKatable(){
        for(int i=1;i<=10;i++){
            System.out.println(2*i);
        }
    }
}
