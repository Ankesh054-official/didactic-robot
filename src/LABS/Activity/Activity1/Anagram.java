package LABS.Activity.Activity1;

//Q1.Java String Program to Check Anagram
//Input: str1 = "Listen"
//str2 = "Silent"
//Output: Yes
//Explanation: A string is called Anagram of other string when the it contains the same characters, only the order of characters can be different.

public class Anagram {

    static String anagramCheck(String str, String st){

        //Convert to lowercase for case-insensitive match.
        str = str.toLowerCase();
        st = st.toLowerCase();

        // Converted a string to a character array.
        char [] strArr = str.toCharArray();

        // To contains same character length should be equal.
        if (st.length() == strArr.length){

            // Iterate through array, Accessing each char and
            // check whether that char exists in string,
            // on each iteration true will continue iteration
            // and on false instantly return NO.
            for (char i : strArr){

                if(!(st.contains(Character.toString(i)))){
                    return "NO";
                }

            }
            return "YES";

        }
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(anagramCheck("ANKESh","esaknh"));
    }
}
