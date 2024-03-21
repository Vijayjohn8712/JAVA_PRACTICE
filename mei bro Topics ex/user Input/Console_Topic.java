import java.io.Console;
class Console_Topic{
public static void main(String[] args){
Console console =System.console();
System.out.println("enter your name");
String name=console.readLine();
char[]passwrdArr=console.readPassword("Enter password: ");
String passwrd=new String(passwrdArr);
double salary=Double.parseDouble(console.readLine("Enter your salary: "));
System.out.println("name: " + name);
System.out.println("password" + passwrd);
System.out.println(salary);
}
}