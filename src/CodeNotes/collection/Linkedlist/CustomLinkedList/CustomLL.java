package CodeNotes.collection.Linkedlist.CustomLinkedList;

import java.util.ArrayList;
import java.util.Collection;

public class CustomLL extends RuntimeException {
    static Node head = null;
    static Node tail = null;
    public int size = 0;
    Node currentNode = null;

    CustomLL(){
        head = new Node();
        this.currentNode = head;
        tail = head;
    }

    CustomLL(ArrayList col){
        this();
        for (Object each : col){
            this.currentNode.next = new Node();
            this.currentNode.data = each;
            this.currentNode = this.currentNode.next;
            tail = this.currentNode;
            this.size++;
        }
    }

    public void add(int index, int data){
        if(index >= 0 && index < size){
            Node temp = head;

            for (int i = 0; i <= (index-1); i++){
                temp = temp.next;
                System.out.println(temp.data);
            }

            Node newNode = new Node(data, temp.next.next);
            temp.next = newNode;

            tail = temp.next.next;
        }
        else {
            throw new IndexOutOfBoundsException();
        }

    }

    public void add(int data){
        this.currentNode.next = new Node();
        this.currentNode.data = data;
        this.currentNode = this.currentNode.next;
        tail = this.currentNode;
        this.size++;
    }

    public void remove(int position){

        if(position > size || position <= 0) throw new IndexOutOfBoundsException("position <= size && position > 0: position = "+position+" && size = "+size);
        Node temp = head;

        if(position == 1){
            head = temp.next;
        }
        for (int pos = 1; pos < position-1; pos++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }

    public void removeData(Object data){
        Node temp = head;
        for (int pos = 1; pos < size; pos++){
            if(temp.next.data == data){
                temp.next = temp.next.next;
                break;
            }else{
                temp = head.next;
            }
        }
    }

    public int size(){
        return this.size;
    }

    public ArrayList printElement(){
        ArrayList list = new ArrayList();
        Node temp = head;
        for (int i = 1; i <= size; i++){
            if(temp.next != null){
                list.add(temp.data);
                temp = temp.next;
            }
        }

        return list;
    }

}
