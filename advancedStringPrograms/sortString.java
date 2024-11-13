
import java.util.Arrays;

public class sortString {
    
    public static String sortStr(String s){

        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public static void main(String[] args)
    {
        String str = "Hello world";
        System.out.println(str);
        System.out.println(sortStr(str));
        System.out.println(sortStr(str));
    }
}
