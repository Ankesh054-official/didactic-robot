package LABS.Activity.Activity1;

import java.util.Scanner;

public class Anagram {
    /**
     * @implNote
     * <ol>
     *     <li>If {@code string1} is anagram of {@code string2} then lengths of both string should be equal.</li>
     *     <li>Converts to lowercase for case-insensitive match.</li>
     *     <li>Converted {@code string1} to a character array.</li>
     *     <li>Iterate through {@code string1_char_array} a character array.</li>
     *     <li>Access and check for each char whether that exists in {@code string2}.</li>
     *     <li>If true than it'll continue iterations after completion of loop returns {@code "YES"} (means It's an anagram) and on false instantly return {@code "NO"} as their is no need to do more iteration.</li>
     *     <li>{@code string1} has to contain all char that exists in {@code string2} to be an anagram of {@code string2}.</li>
     * </ol>
     * @param string1
     * @param string2
     * @return {@code String "YES" || "NO"}
     */
    static String anagramCheck(String string1, String string2){
        if (string1.length() == string2.length()){

            string1 = string1.toLowerCase();
            string2 = string2.toLowerCase();

            char [] string1_char_array = string1.toCharArray();

            for (char i : string1_char_array){

                if(!(string2.contains(Character.toString(i)))){
                    return "NO";
                }

            }
            return "YES";

        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.println(anagramCheck(get.nextLine(), get.nextLine()));
    }
}
