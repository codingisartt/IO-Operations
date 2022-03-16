import java.io.BufferedInputStream;
import java.io.FileInputStream;


public class BufferedInput {
    public static void main(String[] args) {
        try {
            FileInputStream file=new FileInputStream("patika.txt");
            BufferedInputStream buffInput=new BufferedInputStream(file);
            int i=buffInput.read();
            while(i!=-1){
                System.out.print((char) i);
                i=buffInput.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}