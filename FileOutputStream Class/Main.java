import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String str="\nOutputStream öğreniyorum\nPatika.dev";
        try {
            File dosya=new File("patika.txt");
            FileOutputStream output=new FileOutputStream(dosya,true);// If there is not file, it create. if there is not 2nd parameter, it deletes the file. if we do not use "true", it resets and write or do something.
            byte[] strbyte=str.getBytes();
            output.write(strbyte);// it adds in every runtime.
            output.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}