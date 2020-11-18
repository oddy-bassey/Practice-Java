package codeinterview;

public class IntegerToRomanNumerals {

    /*
     *Convert from integer to roman numerals
     */
    public static void main(String[] args){
         System.out.println(toRomanNumerals(3961));
    }

    public static String toRomanNumerals(int value){

        String units[] = {"", "I", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String tens[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String hundreds[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String thousands[] = {"", "M", "MM", "MMM"};

        return thousands[value/1000]+
                hundreds[(value%1000)/100]+
                tens[(value%100)/10]+
                units[value%10];
    }
}
