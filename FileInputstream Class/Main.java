// Inputstream sınıfı byte akışını temsil ediyor. abstract bir sınıf olduğu için bir nesne üretilemiyor. Ondan türemiş alt sınıfları kullanmamız gerekiyor.
import java.io.File;
import java.io.FileInputStream; //veri okumak
public class Main {
    public static void main(String[] args) {
        try {
            File dosya=new File("patika.txt");
            FileInputStream input=new FileInputStream("patika.txt");
            input.skip(10);
            System.out.println("Kullanılabilir byte sayısı: "+input.available());
            //System.out.println(input.read());//80  P
            //System.out.println(input.read());//97  a
            System.out.println("-------------");
            int i=input.read();// int  when program reads a character, it deletes it.
            while(i!=-1){
                System.out.print((char) i);
                i=input.read();
            }
            input.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}