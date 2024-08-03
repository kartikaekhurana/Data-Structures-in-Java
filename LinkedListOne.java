public class LinkedListOne {
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
    public void printList(){
        Node currNode = head;
        while(currNode != null){
        System.out.print(currNode.data + " -> ");
        currNode = currNode.next;

        }
        System.out.println("NULL");
        
    }
public static void main(String args[]){
    LinkedListOne list = new LinkedListOne();
    list.addFirst("Hello");
    list.addFirst("this is My");
    list.addLast("First LinkedList");
    list.printList();
    
}
}