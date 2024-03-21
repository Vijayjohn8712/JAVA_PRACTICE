import java.io.Console;
class Console_Loging{
public static void main(String args[]){
String name=args[0];
String password=args[1];
Console console=System.console();
while(true){
String consName=console.readLine("Enter a Name: ");
char consPassword[]=console.readPassword("Enter a Password: ");
String pass ="";
for(int j=0;j<consPassword.length;j++){
 pass += consPassword[j];
}

if(consName.equals(name) && password.equals(pass)){
System.out.println("Login Successfully");
break;
}
else{
System.out.println("Login UnSuccessfully" +" Please try again ");
}

}
}
}