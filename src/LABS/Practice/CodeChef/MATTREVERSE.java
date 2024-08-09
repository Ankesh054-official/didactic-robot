package LABS.Practice.CodeChef;

import java.util.Scanner;

public class MATTREVERSE {
    public static void main (String[] args)
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int [][]arr = new int [N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = N-1; i >= 0; i--){
            for(int j = 0; j < M; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
