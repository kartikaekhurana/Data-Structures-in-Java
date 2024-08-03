public class LinkedListTwo {
    class Node {
        String data;
        Node next;
    Node(String data){
        this.data = data;
        this.next = null;   
    }  
    } 
    private Node head;

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
          currNode.next = newNode;

    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("The Linkedlist is Empty");
            return;
        }
        head = head.next;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("The Linkedlist is Empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node SecondLast = head;
        Node Last = head.next;
        while(Last.next != null){
            Last = Last.next;
            SecondLast = SecondLast.next;
        }
    }
    public void printList(){
        Node currNode = head;
        while(currNode != null){
        System.out.print(currNode.data + " -> ");
        currNode = currNode.next;

        }
        System.out.println("NULL");
        
    }
public static void main(String args[]){
    LinkedListTwo list = new LinkedListTwo();
    list.addFirst("Hello");
    list.addFirst("this is My");
    list.addFirst("hello 2");
    list.printList();
    list.addLast("First LinkedList");
    list.printList();
    list.deleteFirst();
    list.printList();
    list.deleteLast();
    list.printList();
}
}