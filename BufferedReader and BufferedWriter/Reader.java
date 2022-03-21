import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Reader {

    public static void main(String[] args) {
        try {
            FileReader readFile=new FileReader("patika.txt");
            BufferedReader readBuff=new BufferedReader(readFile);
            /*String line=readBuff.readLine();
            while(line!=null){
                System.out.println(line);
                line=readBuff.readLine();
            } */
            String line;
            while((line=readBuff.readLine())!=null){
                System.out.print(line+" , ");
            }
           
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }

    }
}