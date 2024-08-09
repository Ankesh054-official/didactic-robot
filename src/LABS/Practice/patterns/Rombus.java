package LABS.Practice.patterns;

public class Rombus {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++){

//          first iteration  from (n-i) = 4 to 1: prints space
//          Second iteration from (n-i) = 3 to 1: prints space
//          Third iteration from (n-i) = 2 to 1: prints space
//          Fourth iteration from (n-i) = 1 to 1: prints space

            for (int j = (n-i); j >= 1; j--){
                System.out.print("  ");
            }


            for (int j = 1; j <= n; j++){
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}
