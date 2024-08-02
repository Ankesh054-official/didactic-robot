package CodeNotes.string.Ques;

import java.util.Scanner;

public class Main {

    static boolean palandromUsingTwoPointer(String st){
        st = st.toLowerCase();

        for(int i = 0, j = (st.length()-1); i < j; i++,j--){
            if (st.charAt(i) != st.charAt(j)){
                return false;
            }
        }
        return true;
    }

    static boolean palandromUsingStringBuilder(String st){
        st = st.toLowerCase();

        StringBuilder revst = new StringBuilder(st).reverse();

        if(revst.toString().equals(st)){
            return true;
        }else{
            return false;
        }

    }

    static int countWords(String original){
        String [] orig = original.split(" ");
        int count = 0;
        for (String i : orig){
            if(!i.isEmpty()){
                count++;
            }
        }
        return count;
    }

    static int count(String st){
        for (int i = 0; i < st.length(); i++){

        }
//        return  arr.length;
        return 1;
    }


    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        String str = get.nextLine();


//        System.out.println(palandromUsingStringBuilder(str)?"palandrom":"Not a palandrom");
//
//        System.out.println(palandromUsingTwoPointer(str)?"palandrom":"Not a palandrom");

        System.out.println(count(str));



    }
}
