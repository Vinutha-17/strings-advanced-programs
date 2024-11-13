import java.io.*;
import java.nio.charset.Charset;

public class inputStream {
    public static void main(String[] args) throws IOException {

        String s = "Hello world";
        System.out.println(s);
        InputStream stream = new ByteArrayInputStream(s.getBytes(Charset.forName("UTF-8")));
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        String str = reader.readLine();
        System.out.println("InputStream");
        while(str != null){
            System.out.println(str);
            str = reader.readLine();
        }
    }
}
