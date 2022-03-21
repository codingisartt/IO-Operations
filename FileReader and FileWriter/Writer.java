import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        String data="Patika 102 Dersleri";//converting to this

        try {
            FileWriter output=new FileWriter("writer.txt");
            output.write(data);

            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
