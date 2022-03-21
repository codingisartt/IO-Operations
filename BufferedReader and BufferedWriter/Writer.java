import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        String data="JAVAÖĞRENİYORUM";

        File dosya=new File("writer.txt");
        try {
            FileWriter writeFile=new FileWriter(dosya);
            BufferedWriter writeBufff=new BufferedWriter(writeFile);

            writeBufff.write(data);


            writeBufff.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }
}
