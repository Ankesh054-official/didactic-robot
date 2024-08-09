package LABS.Practice.CodeChef;

import java.util.Scanner;

public class MATDIAGSUM {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [][]arr = new int [N][N];
        int sum = 0;

        for(int i = 0; i < N; i++){
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if((((i+j)%2 == 0) && j == i) || ((i+j) == (N-1))){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
