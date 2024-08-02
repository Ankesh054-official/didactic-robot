package LABS.Activity.Activity1;

public class DuplicateChar {

    static int duplicate(String original){
        int count = 0;

        original = original.replace("\\s","");

        int []orig = new int[126];

        for (int i = 0; i < (original.length()-1); i++){
            orig[original.charAt(i)]++;
        }

        for (int i = 0; i < orig.length; i++){

        }

        return count;
    }

}
