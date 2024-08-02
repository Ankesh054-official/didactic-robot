package CodeNotes.collection.stack;

import java.awt.image.RasterOp;
import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack st = new Stack();

        // Inserting elements in stack
        for(int i = 1; i <= 10; i++){
            st.push(i);
        }


        ArrayList even = new ArrayList();
        ArrayList odd = new ArrayList();

        // Traversing
        int N = st.size();
        for (int i = 1; i <= N; i++){
            int temp =  (int) st.pop();
            if(temp%2 == 0){
                even.add(temp);
            }else {
                odd.add(temp);
            }
        }


        System.out.println("even "+even);
        System.out.println("odd "+odd);


    }
}
