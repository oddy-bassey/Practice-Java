package codeinterview;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralsToInteger {

    public static void main(String[] args){
        System.out.println("MMMCMLXI - "+romanNumeralToInteger("MMMCMLXI"));
    }

    public static int romanNumeralToInteger(String romanValue){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for(int i=0; i<romanValue.length(); i++){

            if(i>0 && map.get(romanValue.charAt(i))>map.get(romanValue.charAt(i-1))){
                result += map.get(romanValue.charAt(i))- (2*map.get(romanValue.charAt(i-1)));
            }else {
                result += map.get(romanValue.charAt(i));
            }
        }
        return result;
    }
}
