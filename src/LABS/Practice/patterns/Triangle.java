package LABS.Practice.patterns;

public class Triangle {
    public static void main(String[] args) {
        /**
         *        ___x
         *        __x_x
         *        _x_x_x
         *        x_x_x_x
         */

        int n = 4;

        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++){
                System.out.print("x ");
            }
            System.out.println();
        }


    }
}
