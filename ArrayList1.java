import java.util.*;
public class ArrayList1 {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
      int element = list.get(3);
      System.out.println(element);
      list.add(1,6);
      System.out.println(list);
      list.set(0,7);
      System.out.println(list);
      list.remove(3);
            System.out.println(list);
      Collections.sort(list);
            System.out.println(list);       
    }
}
