import java.io.Console;
class Repeated_Prompt{
public static void main(String[] args){
Console console=System.console();
String word=console.readLine("Enter a word: ");
while(true){
if(word.equals("exist")){
break;
}else{word=console.readLine("Enter a word: ");}
}
}
}