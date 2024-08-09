package LABS.Practice.CodeChef;

import java.util.Scanner;

public class MATZIGZAG {
    public static void main (String[] args)    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();

        int [][]arr = new int[N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int direction = 1;
        for(int i = 0; i < N; i++){
            switch(direction){
                case 1:
                    for(int j = 0; j < M; j++){
                        System.out.print(arr[i][j]+" ");
                    }
                    direction = 2;
                    break;
                case 2:
                    for(int j = M-1; j >= 0; j--){
                        System.out.print(arr[i][j]+" ");
                    }
                    direction = 1;
                    break;
            }
        }
    }
}
