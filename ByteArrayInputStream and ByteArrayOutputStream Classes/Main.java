import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        byte[] dizi={1,2,3,54,66};
        ByteArrayInputStream input=new ByteArrayInputStream(dizi,0,4);
        System.out.println("Kullanılabilen byte sayısı: "+input.available());
        input.skip(2);
        int i=input.read();
        while(i!=-1){
            System.out.println(i);
            i=input.read();
        }
        try {
            input.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}