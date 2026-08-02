package Methods;

public class MaxofTwo {
    public static int max (int a,int b,int c){
        if(a>=b&&a>=c)return a;
        else if(b>=a&&b>=c)return b;
        else return c;
    }

    static void main() {
        System.out.println(max(2,4,9));
    }
}
