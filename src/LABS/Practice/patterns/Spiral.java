package LABS.Practice.patterns;

import java.util.ArrayList;

public class Spiral {
    public static void main(String[] args) {
        int N = 10;
        int [][]arr = new int[N][N];


        int count = 1;

        int top = 0, left = 0, right = (N-1), bottom = (N-1);

        while(left<=right && top <= bottom){
            for(left = 0; left <= right; left++){
                arr[top][left] = count++;
            }
            top++;

            for (; top <= bottom; top++){
                arr[top][right] = count++;
            }
            right++;

            for(; right <= 0; right--){
                arr[bottom][right] = count++;
            }
            bottom++;

            for (; bottom <= 0; bottom--){
                arr[bottom][right] = count++;
            }
            right++;
        }

        for (int i = 0; i <= N-1; i++){
            for(int j = 0; j <= N-1; j++){
                System.out.print(arr[i][j]+' ');
            }
            System.out.println();
        }



    }
}
