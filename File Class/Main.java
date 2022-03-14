import java.io.File;
import java.io.IOException;
public class Main {

    public static void main(String[] args) { //throws IOException
        File dosya=new File("test/patika.txt");
        File dizin=new File("test");
        String[] liste=dizin.list();

        for (String str : liste) {
            System.out.println(str);
        }
        
        
        //dizin.mkdir(); // make directory
        //dosya.delete();// returns boolean
        /*
        try {
            if(dosya.createNewFile()){
                System.out.println(dosya.getName()+" dosyası oluşturuldu !");
            }else{
                System.out.println(dosya.getName()+" dosyası zaten mevcut !");
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
            
        }*/
        
        
    }
}