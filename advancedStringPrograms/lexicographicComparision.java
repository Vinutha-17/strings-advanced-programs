public class lexicographicComparision {
    
    private static void compareLexico(String s1, String s2){

        System.out.println(s1.compareTo(s2));
    }

    public static void main(String[] args) {
        
        String s1 = "hello";
        String s2 = "world";
        String s3 = "hello";
        String s4 = "HELLO";

        compareLexico(s1, s2);
        compareLexico(s2, s3);
        compareLexico(s1,s3);
        compareLexico(s1, s4);

    }
}
