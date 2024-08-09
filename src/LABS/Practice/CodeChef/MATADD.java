package LABS.Practice.CodeChef;

import java.util.Scanner;

public class MATADD {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();
        int [][]A = new int [N][M];
        int [][]B = new int [N][M];
        int [][]C = new int [N][M];


        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                A[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                B[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

    }
}
