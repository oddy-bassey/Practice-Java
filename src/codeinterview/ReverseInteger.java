package codeinterview;

public class ReverseInteger {

    /*
     *Reverse an integer value
     */

    public static void main(String[] args){
        System.out.println(reverseInteger(12345));
    }

    public static long reverseInteger(int input){
        long reversed = 0;

        while(input != 0){
            reversed = (reversed*10) + (input%10);
            input /= 10;

            if(reversed>Integer.MAX_VALUE || reversed<Integer.MIN_VALUE){
                return 0;
            }
        }

        return reversed;
    }
}
