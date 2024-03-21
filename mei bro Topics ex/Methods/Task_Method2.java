import java.io.*;
class Task_Method2{
static int result;
static int add(int a, int b){
return  result=a+b;
}
public static void main(String args[]){
Console console=System.console();
int a=Integer.parseInt(console.readLine("Enter value a: "));
int b=Integer.parseInt(console.readLine("Enter value b: "));
result=add(a,b);
System.out.print("Result is: "+result);
}
}