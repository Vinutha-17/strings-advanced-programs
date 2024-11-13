import java.util.Stack;

public class reveseByStack {
    
    public static String rever(String s){

        char[] rev = new char[s.length()];

        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            stack.push(s.charAt(i));
        }
        int i=0;
        while(!stack.isEmpty()){
            rev[i++] = stack.pop();
        }
        return new String(rev);
    }

    public static void main(String[] args)
    {
        String s = "Hello world";

        System.out.println(s+" <reverse> "+rever(s));
    }
}
