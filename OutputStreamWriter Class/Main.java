import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        String data="ĞÜŞİ";
        try {
            FileOutputStream fileOutput=new FileOutputStream("output.txt");
            OutputStreamWriter fileWriter=new OutputStreamWriter(fileOutput,"UTF8");

            fileWriter.write(data);
            fileWriter.close();
            //fileOutput.write(data.getBytes("UTF8"));
            //fileOutput.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}