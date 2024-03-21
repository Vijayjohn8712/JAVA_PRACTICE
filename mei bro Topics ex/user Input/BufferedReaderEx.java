import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderEx{
public static void main(String[] args)throws Exception{
InputStreamReader inputStream = new InputStreamReader(System.in);
BufferedReader reader=new BufferedReader(inputStream);

String name=reader.readLine();
Double age=Double.parseDouble(reader.readLine());
System.out.println(name);
System.out.println(age);
}
}