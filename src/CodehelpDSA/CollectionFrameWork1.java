package CodehelpDSA;

import java.util.*;

public class CollectionFrameWork1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        //addall
        List<Integer> list2= new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list.addAll(list2);//add all ele of list in list
        System.out.println(list);
        list.removeAll(list2);//remove all ele of list2 in list
        System.out.println(list);
        System.out.println(list.size());
        //iterator for traversing the list
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
          System.out.println(iterator.next());
        }
        List<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(14);
      System.out.println(list3.get(0));
      System.out.println("Before list3"+list3);
      list3.set(0,100);
      System.out.println(list3.get(0));
      System.out.println("After list3"+ list3);
      //toArray
      Object[] arr=list3.toArray();
      for(Object obj: arr){
        System.out.println(obj);
      }
      //contains
      System.out.println(list3.contains(100));
      list.add(60);
      list.add(12);
      list.add(6);
      list.add(20);
      System.out.println("Printing Entire list"+list);
      //sort an ArrayList
      Collections.sort(list);
      System.out.println(list);
      ArrayList<Integer> list4=(ArrayList<Integer>) list.clone();
      System.out.println(list4);
      System.out.println(list4.isEmpty());
      System.out.println(list4.indexOf(40));
      //linkedlist
      System.out.println(list4.lastIndexOf(20));
      LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(101);
        l1.add(10);
        System.out.println(l1);
        l1.addFirst(1);
        System.out.println(l1);
        l1.removeLast();
        System.out.println(l1);
        System.out.println(l1.peek());
      Stack<Integer> st = new Stack<>();
      st.push(10);
      System.out.println(st);
      st.push(11);
      System.out.println(st);
      st.push(12);
      System.out.println(st);
      st.pop();
      System.out.println(st);
      System.out.println(st.peek());
      System.out.println(st.search(10));
      System.out.println(st.empty());
    }
}
