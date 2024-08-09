package LABS.Practice.CodeChef;

import java.util.Scanner;

public class MATNEGCOUNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();

        int [][]arr = new int[N][M];

        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                if(arr[i][j] < 0){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
