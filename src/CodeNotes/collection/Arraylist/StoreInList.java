package CodeNotes.collection.Arraylist;

import java.util.ArrayList;

public class StoreInList {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.clone();

        for(int i = 1; i <= 10; i++){
            list.add(i);
        }

        for (Object i : list){
            System.out.println(i);
        }
    }
}
