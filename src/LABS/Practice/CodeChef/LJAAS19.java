package LABS.Practice.CodeChef;

public class LJAAS19 {
    public static void main(String[] args) {
        String x = "i     Love code.";
        for(String i : x.split(" ")){
            if(!i.isBlank()){
                System.out.println(i);
            }
        }
    }
}
