package LABS.lab12.assignment2;

import java.util.ArrayList;

public class EvenSum {

    /**
     *
     * @param num
     * @return
     */
    private static boolean isEven(int num){
        return (num%2 == 0);
    }

    /**
     *
     * @param l
     * @return
     */
    public static int sumOfN(ArrayList<Integer> l){
        int sum = 0;

        for(int i: l){
            if(EvenSum.isEven(i)){
                sum += i;
            }
        }

        return sum;
    }
}

class Main{
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            intList.add(i);
        }

        System.out.println(EvenSum.sumOfN(intList));
    }
}
