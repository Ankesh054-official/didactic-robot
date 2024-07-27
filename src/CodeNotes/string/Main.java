package CodeNotes.string;

public class Main {
    public static void main(String[] args) {
        String str = new String("aBc");
        String st = new String("abC");


        System.out.println(st.compareTo(str));
        System.out.println(st.compareToIgnoreCase(str));


        System.out.println("===================");

        String ste = new String("A");
        System.out.println(ste.replace("A","jsajsa"));
    }
}
