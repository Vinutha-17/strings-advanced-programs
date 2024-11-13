

public class replaceCharacter {

    static void replace(String s, int index,char c){
        StringBuilder sb = new StringBuilder(s);
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(i == index){
                sb.setCharAt(i, c);
            }
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args)
    {

        String s = "hello world";
        replace(s, 4, 'l');
    }
}
