package RecursionDsa;
 import java.util.ArrayList;
 import java.util.List;
public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> l= new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);//add ele
        System.out.println(l);
        System.out.println(l.get(1));//20
        System.out.println(l.size());//3
        l.remove((Integer) 30);
        System.out.println(l);
    }
}
