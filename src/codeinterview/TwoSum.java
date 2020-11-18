package codeinterview;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /*
     *Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     *You may assume that each input would have exactly one solution, and you may not use the same element twice.
     */
    public static void main(String[] args) {
        int[] values = {2,7,11,15};

        int[] result = getTwoSum(values, 13);
        System.out.println("result - ["+result[0]+", "+result[1]+"]");
    }

    public static int[] getTwoSum(int[] numbers, int target){

        Map<Integer, Integer> numberMap = new HashMap<>();

        //parse through the array once
        for(int i=0; i<numbers.length; i++){

            //get the difference between the target value and the seen value
            int delta = target-numbers[i];

            //check if the difference(delta) is available in the already seen values
            if(numberMap.containsKey(delta)){

                //if available return the index of both numbers
                return new int[] {i, numberMap.get(delta)};
            }
            //if not add number value as key and  numberindex as value to map
            numberMap.put(numbers[i], i);
        }

        return new int[] {-1, -1};
    }
}
