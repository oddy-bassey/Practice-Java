package codeinterview;

public class MaximumPalindrome {

    private static int resultStart = 0;
    private static int resultLength = 0;

    public static void main(String[] args){

    }

    public String longestPalindrome(String stringValue){

        int stringLength = stringValue.length();

        //check if string length is zero or one
        if(stringLength<2){
            return stringValue;
        }

        //loop through the string through a single parse and check if each individual character is
        //a possible center of each individual possible palindrome! If it is, keep track of that
        //length, starting position and at the end, we'll retrieve the biggest palindrome that will
        //be saved in that variable.

        for(int start = 0; start < stringLength; start++){
            expandRange(stringValue, start, start);
            expandRange(stringValue, start, start+1);
        }

        return stringValue.substring(resultStart, resultStart+resultLength);
    }

    public void expandRange(String stringValue, int begin, int end){

        //check the boundaries of the string and if characters are equal
        while (begin>=0 && end<stringValue.length() && stringValue.charAt(begin) == stringValue.charAt(end)){
            begin--;
            end++;
        }

        //check if the previous palindrome length is less than the current length, then reassign
        if(resultLength < end - begin - 1){
            resultStart = begin+1;
            resultLength = end - begin - 1;
        }
    }
}
