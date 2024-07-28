package LABS.Activity.Activity1;

//Q2. Write a Java program to convert all characters in a string to lowercase.
//        Ex- Original String: The Quick BroWn FoX!
//String in lowercase: the quick brown fox!


public class ConLowerstr {
    public static void main(String[] args) {
        String original = "The Quick BroWn FoX!";
        String original_lower = original.toLowerCase();

        System.out.println(original);
        System.out.println(original_lower);
    }
}
