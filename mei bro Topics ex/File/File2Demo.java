import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.annotation.processing.Filer;

public class File2Demo{
    public static void main(String[] args){
        File file=new File("C:\\java programs\\mei bro Topics ex\\File\\vijay\\Raja\\Manthiri.txt");
        try{
             file.createNewFile();
        FileWriter writer =new FileWriter(file);
        writer.write(98); //to write asscii value
        writer.write("How are You");
        writer.flush();   //usage of push the value into file.
        writer.close();   //must give.
        FileReader fr=new FileReader(file);
        // int output=fr.read();
        // while (output!= -1) {
        //     System.out.print((char)output);
        //      output=fr.read();
        // }

        //Count of Character:
        char[] ch=new char[(int)file.length()];   //file.length() return  type is length, array type is int   so its convert to int
        System.out.println(ch.length);
        //print count characters:
       fr.read(ch);
       for(char c:ch){
        System.out.println(c);
       }
        }
        catch(Exception e){
         e.getStackTrace();
        }
    }
}