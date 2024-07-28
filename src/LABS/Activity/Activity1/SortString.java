package LABS.Activity.Activity1;

/** Q4. Java String Program to Sort a String
 * Input : "software"
 * Output:"aeforstw"
 */


public class SortString {

    /**
     * Method: {@link #sortString(String)}
     * @param original
     * Method will get {@code String original} and Performed bubble sort on {@code char_array}.
     * @return new String(char_array)
     *
     */
    public static String sortString(String original){

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
