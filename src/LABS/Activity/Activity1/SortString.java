package LABS.Activity.Activity1;

/** Q4. Java String Program to Sort a String
 * Input : "software"
 * Output:"aeforstw"
 */


public class SortString {

    public static String sortString(String original){
        /**
         * Method will get @param {@code String original} and @return
         * {@code new String(char_array)}.
         *
         * Performed bubble sort on {@code char_array}.
         */

        char []char_array = original.toCharArray();
        int len_of_char_arr = char_array.length;

        for (int i = 0; i < len_of_char_arr; i++){
            for(int j = (i+1); j < len_of_char_arr; j++){
                if(char_array[i] > char_array[j]){
                    char temp = char_array[i];
                    char_array[i] = char_array[j];
                    char_array[j] = temp;
                }
            }
        }

        return new String(char_array);
    }

    public static void main(String[] args) {
        System.out.println(sortString("sdhjcbsdabsdfsdc"));
    }

}
