package LABS.Practice.patterns;

public class HollowRectangle {
    public static void main(String[] args) {
        /**
         *           1  2  3  4  5
         *           (i,j)
         *           (1,1) (1,2) (1,3) (1,4) (1,5)
         *     1       x     x     x     x     x
         *           (2,1) (2,2) (2,3) (2,4) (2,5)
         *     2       x     _     _     _     x
         *           (3,1) (3,2) (3,3) (3,4) (3,5)
         *     3       x     _     _     _     x
         *           (4,1) (4,2) (4,3) (4,4) (4,5)
         *     4       x     x     x     x     x
         */

        int n = 4, m = 5;

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= m; j++){
                if((i == 1 || i == 4) || (j == 1 || j == 4)){
                    System.out.print("x ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
