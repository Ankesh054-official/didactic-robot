package LABS.Practice.patterns;

public class MirroredRightTriangle {
    public static void main(String[] args) {
        /**
         *      _ _ _ x
         *      _ _ x x
         *      _ x x x
         *      x x x x
         *
         */

        int n = 4;
        for (int i = 1; i <= n; i++){
            for (int j = (n-i); j >= 1; j--){
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++){
                System.out.print("x ");
            }

            System.out.println();
        }

    }
}
