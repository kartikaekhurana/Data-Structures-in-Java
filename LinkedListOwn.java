import java.util.*;
public class LinkedListOwn {
      public static void main(String args[]){
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(1);
        list1.addFirst(6);
        list1.addLast(3);
        list1.addLast(5);
        list1.addLast(11);
        list1.addLast(8);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);       
      }
}
