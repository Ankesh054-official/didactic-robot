package LABS.Activity.Activity3;

import java.util.Scanner;

/**
 * 3. Write a program to reverse a given List of strings.
 */

public class ReverseString {


    /**
     * Methdod: {@link #reverse(String)}
     * @implNote Used to reverse String {@code original}.
     * <p><blockquote>
     *          <pre>
     *              original = "Hello"
     *              reversed = "olleH"
     *          </pre>
     *       </blockquote></p>
     *
     *
     * @param original
     * @return
     */
    public static String reverse(String original){
        String reversed = "";

        for(int i = (original.length()-1); i >= 0; i--){
            reversed += original.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Enter a Sentence/ Word:\t");
        String orginal = get.nextLine();

        System.out.println("Original String:\t"+orginal);
        System.out.println("Reversed String:\t"+reverse(orginal));


    }
}
