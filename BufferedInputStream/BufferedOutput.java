import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutput {
    public static void main(String[] args) {
        String data="Java 102 Patikasi";
        try {
            FileOutputStream fileout=new FileOutputStream("patika2.txt");
            BufferedOutputStream buffFile=new BufferedOutputStream(fileout);

            byte[] byteArray=data.getBytes();

            buffFile.write(byteArray);
            buffFile.close();
            fileout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
