package LABS.Practice.Multithreading;


import java.lang.reflect.Array;

/**
 * 1. Create two thread. one thread is finding the average of the first 10 numbers and
 * another thread is printing the square of the number stored in array arr={1,20,50,15,30}
 * and make sure both threads can execute one by one.
 * 2.Create three threads in Java to simulate a race among them. Each thread should
 * have a name and display its name and current iteration number. Use Thread.sleep() to
 * introduce a delay between iterations. Also, set different priorities for the threads.
 */

class Average extends Thread{

    private Number average(){
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            sum += i;
        }

        return sum/10;
    }

    @Override
    public void run() {
        System.out.println(this.average());
    }
}

class Square extends Thread{
    private int square(int i){
        return i*i;
    }

    @Override
    public void run(){
        int []arr = {1,20,50,15,30};
        int []squaredArr = new int[arr.length];
        int []sortedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            squaredArr[i] = this.square(arr[i]);
        }

        for (int i = 0; i < squaredArr.length; i++){
            if(squaredArr[i] > squaredArr[i+1]){

            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Average av = new Average();
        av.start();
        Square sq = new Square();
        sq.start();
    }
}
