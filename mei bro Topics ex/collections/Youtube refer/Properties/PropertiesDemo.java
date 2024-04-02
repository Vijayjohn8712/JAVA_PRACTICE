

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception{
        Properties pr = new Properties();
         
        FileInputStream fis = new FileInputStream("C:\\java programs\\mei bro Topics ex\\collections\\Youtube refer\\Properties\\menu.properties");
        pr.load(fis); 
        System.out.println(pr.getProperty("NellaiExpress"));
        pr.setProperty("NellaiExpress", "2000");
        System.out.println(pr);
       FileOutputStream fos=new FileOutputStream("C:\\java programs\\mei bro Topics ex\\collections\\Youtube refer\\Properties\\menu.properties");
        pr.store(fos, "Update values");

    }
}
