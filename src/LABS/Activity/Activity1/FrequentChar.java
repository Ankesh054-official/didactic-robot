package LABS.Activity.Activity1;

//Q3. Write a Java program to find the character in a string that occurs
// the most frequently.
//Sample Output:
//The given string is: test string
//Max occurring character in the given string is: t

public class FrequentChar {

    static String mostFrequentChar(String input){

        /** This method get @param {@code input} and @return {@code String_type},
         * Which is the most frequent char in the {@code String input}.
         * if not even one character is frequenter than it'll return first character.
         */

        // Convert to char array to check for each character.
        char []input_char_array = input.toCharArray();

        // To store the occurring_char as output character.
        String occurring_char = "";

        int occurring_char_frequency = 0;

        // Iterating through array using for each loop
        for(char i : input_char_array){

            // Converted character to string to use required string methods.
            String x = Character.toString(i);

            /** Checking string {@code x} shouldn't be a blank string (Means string
             * with only whitespaces).
             * At initial {@code occurring_char_frequency = 0}, Checks length
             * array of strings created using {@code split(x)} should be
             * greater than {@code occurring_char_frequency}. Which is frequency
             * of character {@code x} in {@code String input}.
             *
             * if we {@code input.split(x)} a string {@code input} containing a
             * subString {@code x} than the array {@code input_char_array} we get
             * has length equal to the occurrence of the string {@code x} in
             * {@code input} String.
             *
             * Updating the latest values of {@code occurring_char_frequency & occurring_char}
             * for next iterations.
             */
            if(!x.isBlank()) if (occurring_char_frequency < input.split(x).length) {
                occurring_char_frequency = input.split(x).length;
                occurring_char = x;
            }
        }

        return occurring_char;
    }

    public static void main(String[] args) {
        System.out.println(mostFrequentChar("ankesh"));

    }
}
