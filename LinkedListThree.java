import java.util.*;
public class LinkedListThree {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("My Name");
        list.addFirst("Listen");
        list.addLast("is Kartikae ");
        System.out.println(list);
        System.out.println(list.size());
        list.removeFirst();
        System.out.print(list);
    }
}
