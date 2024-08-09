package LABS.Practice.patterns;

public class InvertedRightTriangle {
    public static void main(String[] args) {
        /**
         *          x x x x
         *          x x x
         *          x x
         *          x
         */

        int n = 4;

        for (int i = n; i >= 1; i--){
            for (int j = i; j >= 1; j--){
                System.out.print("x ");
            }
            System.out.println();
        }

    }
}
