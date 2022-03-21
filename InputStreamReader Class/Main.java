import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Main {

    public static void main(String[] args) {
        try {
            FileInputStream fileInput=new FileInputStream("patika.txt");

            InputStreamReader inputReader=new InputStreamReader(fileInput,"UTF8");
            //InputStreamReader inputReader=new InputStreamReader(fileInput,Charset.forName("Big5")); //Chinese
            System.out.println(inputReader.getEncoding()); // default Charset: Cp1254

            int i=inputReader.read();
            while(i!=-1){
                System.out.print((char) i);
                i=inputReader.read();
            }
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }

    }
}