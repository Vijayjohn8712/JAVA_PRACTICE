import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDemo {
public static void main(String agrs[]){
    //InputStream and OutputStream is Abstract cls
    try (InputStream input = new FileInputStream("C:\\Users\\vjjoh\\OneDrive\\Pictures\\car.jpg") ;OutputStream output=new FileOutputStream("C:\\Users\\vjjoh\\OneDrive\\Pictures\\copycar.jpg")) {
        int content=input.read();
        while(content != -1){
            output.write(content);
            content=input.read();
        }
        output.flush();
   

    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
}
}