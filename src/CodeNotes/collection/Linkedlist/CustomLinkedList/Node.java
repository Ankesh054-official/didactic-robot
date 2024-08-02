package CodeNotes.collection.Linkedlist.CustomLinkedList;

public class Node {
    public Node previous = null;
    public Node next = null;
    public Object data;

    Node(){
    }

    Node(int data){
        this.data = (Object) data;
    }

    Node(int data, Node next){
        this.data = (Object) data;
        this.next = next;
    }

    Node(Node previous, int data, Node next){
        this.previous = previous;
        this.data = (Object) data;
        this.next = next;
    }
}
