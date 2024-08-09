package LABS.Practice.patterns;

public class CounterTriangle {
    public static void main(String[] args) {
        /**
         *              1
         *              2 3
         *              4 5 6
         *              7 8 9 10
         *              11 12 13 14 15
         *
         */

        int n = 5, count = 0;

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
