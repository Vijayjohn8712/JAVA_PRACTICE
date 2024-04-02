import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferRw {
    public static void main(String[] args) {
        File file =new File("C:\\java programs\\mei bro Topics ex\\File\\vijay\\Raja\\Manthiri.txt");
        try (FileWriter fw = new FileWriter(file,true)) {
            BufferedWriter bw=new BufferedWriter(fw);   //bufferWriter only accept Writeter obj so we give fileWriter ob fw.
            bw.write("Tamil");
            bw.newLine();
            bw.write("English");
            bw.newLine();
            bw.write(66);

            bw.flush();

            FileReader fr =new FileReader(file);
            BufferedReader bf =new BufferedReader(fr); //bufferReader only accept Reader obj so we give filereader ob fr.
            String output=bf.readLine();
            int lineCount=0;
            int sentenceCount=0;
            int wordCount=0;
            int charCount=0;
          
            while(output != null){
                  String[] word  = output.split(" ");
                  wordCount =wordCount+word.length;

                String[] sentence =output.split("[.]");
                sentenceCount=sentenceCount+sentence.length;

                int length=output.length();
                charCount=charCount+length;
               
                System.out.println(output);
                output=bf.readLine();
                lineCount++;
            }
            System.out.println(lineCount);
            System.out.println("sentence count"+sentenceCount);
            System.out.println("Word Count : "+wordCount);
            System.out.println("Char count :"+ charCount);
       
            fr.close();
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
