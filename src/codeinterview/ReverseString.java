package codeinterview;

public class ReverseString {

    /*
     *Reverse a string of alphabets using StrinBuilder or manually
     */
    public static void main(String[] args){

        System.out.println(revertWithoutBuilder("come to daddy :)"));
        System.out.println(revertWithStringBuilder("incredible dynasty :)"));
    }

    public static String revertWithStringBuilder(String value){

        return new StringBuilder(value).reverse().toString();
    }

    public static String revertWithoutBuilder(String value){
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=value.length()-1; i>=0; i--){
            stringBuilder.append(value.charAt(i));
        }
        return stringBuilder.toString();
    }
}
