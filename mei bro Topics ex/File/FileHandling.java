import java.io.File;
import  java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileHandling{
    public static void main(String[] args) throws IOException{
        File file=new File("info.txt");
        if(file.exists()){
            file.createNewFile();
        }

        FileWriter writer=new FileWriter(file);
        writer.write("one");
        writer.write("two");
        writer.write("three");
        writer.close();

        File readFile=new File("data.txt");
        Scanner sc=new Scanner(readFile);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}