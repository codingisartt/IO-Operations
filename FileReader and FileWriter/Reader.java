import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class Reader {
    public static void main(String[] args) {
        
        try  {
            FileReader readFile = new FileReader("reader.txt",Charset.forName("UTF8"));

            int data=readFile.read();
            while(data!=-1){
                System.out.print((char) data);
                data=readFile.read();
            }
            readFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}