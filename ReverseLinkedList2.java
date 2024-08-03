public class ReverseLinkedList2 {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("The Linkedlist is Empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("The Linkedlist is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node last = head.next;
        while (last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null; 
    }

    public Node reverseListRecursive(Node Head) { 
        if (Head == null || Head.next == null) {
            return Head;
        }
        Node newHead = reverseListRecursive(Head.next); 
        Head.next.next = Head; 
        Head.next = null; 
        return newHead;
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String args[]) {
        ReverseLinkedList2 list = new ReverseLinkedList2();
        list.addFirst("1");
        list.addLast("2");
        list.addLast("3");
        list.printList(); 
        list.head = list.reverseListRecursive(list.head); 
        list.printList(); 
    }
}
