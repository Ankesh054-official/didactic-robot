package LABS.lab12.assignment3;

import java.util.ArrayList;

public class Main {

    /**
     * @param list
     * @return
     */
    public static ArrayList<String> reverselist(ArrayList<String> list){
        ArrayList<String> reversedlist = new ArrayList<>();
        for (int i = (list.size()-1); i >= 0; i--){
            reversedlist.add(list.get(i));
        }

        return reversedlist;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("World, I am here.");
        list.add("How are you?");
        list.add("Writing code.");

        System.out.println(reverselist(list));
        System.out.println(list);
    }
}
