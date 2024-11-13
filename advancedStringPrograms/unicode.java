public class unicode {
    
    private static void unicodePoint(String s){

        int n = s.length();

        for(int i = 0; i < n; i++){
            System.out.print("unicode point at " + i + " " );
            System.out.print(s.codePointAt(i));
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        String s = "Hello world";
        unicodePoint(s);
    }
}
