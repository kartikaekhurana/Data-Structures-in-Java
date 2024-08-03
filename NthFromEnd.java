import java.util.LinkedList;

public class NthFromEnd {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        int n = 2;
        removeNthFromEnd(linkedList, n);
        
        System.out.println(linkedList);
    }

    public static void removeNthFromEnd(LinkedList<Integer> linkedList, int n) {
        int size = linkedList.size();
        if (n > size || n <= 0) {
            throw new IllegalArgumentException("Invalid value of n: " + n);
        }
        int indexToRemove = size - n;
        linkedList.remove(indexToRemove);
    }
}