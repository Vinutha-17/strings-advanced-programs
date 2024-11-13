import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    
    private static void reg(String s)
    {
        Pattern p = Pattern.compile("\\b[a-zA-Z]");
        Matcher m1 = p.matcher(s);

        System.out.println("First letter of pattern: " + s);
        while(m1.find())
            System.out.print(m1.group()+" ");
    }

    public static void main(String[] args) {
        String s = "Hi my name is Vinutha";

        reg(s);
    }
}
