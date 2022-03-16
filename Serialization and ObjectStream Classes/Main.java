import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Car c1=new Car("Audi", "A3");

        try {
            FileInputStream inputFile=new FileInputStream("araba.txt");
            ObjectInputStream inputStream=new ObjectInputStream(inputFile);
            Car newCar=(Car)inputStream.readObject();
            System.out.println(newCar.getBrand());
            System.out.println(newCar.getModel());

            inputFile.close();
            inputStream.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }




        try  {
            FileOutputStream outputFile=new FileOutputStream("araba.txt");
            ObjectOutputStream output = new ObjectOutputStream(outputFile);
            output.writeObject(c1);
            output.close();
        } catch ( IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}