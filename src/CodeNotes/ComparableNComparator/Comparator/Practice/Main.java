package CodeNotes.ComparableNComparator.Comparator.Practice;


import java.util.Comparator;
import java.util.TreeSet;

class SortByLenNAlp implements Comparator<String>{
    /**
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(String o1, String o2) {
        if(o1.length() > o2.length()){
            return 1;
        }else if(o1.length() < o2.length()){
            return -1;
        }else{
            return o1.compareTo(o2);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String []input = {"AAAA", "BB","A", "BBB", "AA", "AAA","B"};
        TreeSet ts = new TreeSet(new SortByLenNAlp());
        for (String i : input){
            ts.add(i);
        }

        System.out.println(ts);
    }
}
