import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulation {

    public static void main (String[] args){
        /*String river = "mississipi";
        Pattern pattern = Pattern.compile("mi(.*?)pi");
        Matcher matcher = pattern.matcher(river);

        while(matcher.find()){
            System.out.println(matcher.group(1));
        }*/
        String value = "welcome";
        StringBuilder builder = new StringBuilder(value);
        builder.append("\n to revoltcode");
        builder.append("\n we provide technical services");
        System.out.println(builder.toString());
    }
}
