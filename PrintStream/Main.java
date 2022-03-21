import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        try {
            PrintStream output=new PrintStream("print.txt");
            output.print(45454465+"000");
            output.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}