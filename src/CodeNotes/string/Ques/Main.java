package CodeNotes.string.Ques;

public class Main {
    public static void main(String[] args) {
        String str = new String("This cc        is my De              mo String");
        String output = new String();

        // ["This", "is", "my", "Demo", "String"]
        String []arr = str.split(" ");
        int len = arr.length;

        // Traversing from (length_of_array-1) to 0.
        for(int i = (len-1); i >= 0; i--){
            if(!(arr[i]).isBlank()){
                output += (" "+arr[i]);
            }
        }

        System.out.println(output.trim());

        String st = new String("Ankesh");
        String strs = new String("Ankesh");
        String ste = "Ankesh";
        String sted = "Ankesh";

        System.out.println("=========obj2===========");
        System.out.println(st == strs);
        System.out.println(st.equals(strs));

        System.out.println(st == ste);
        System.out.println(st.equals(ste));

        System.out.println(ste == sted);
        System.out.println(ste.equals(sted));


    }
}
