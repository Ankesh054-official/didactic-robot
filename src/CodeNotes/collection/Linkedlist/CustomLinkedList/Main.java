package CodeNotes.collection.Linkedlist.CustomLinkedList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();


        CustomLL cll = new CustomLL();
        System.out.println(cll.size());
        for(int i = 1; i <= 10; i++){
            cll.add(i);
        }
        System.out.println(cll.size());
        System.out.println(cll.printElement());

        cll.remove(10);
        System.out.println(cll.printElement());

    }
}
