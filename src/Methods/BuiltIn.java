package Methods;
import java.sql.SQLOutput;
import java.util.Scanner;

public class BuiltIn {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        System.out.println(Math.max(Math.max(a,(Math.max(b,c))),d));
    }
}
