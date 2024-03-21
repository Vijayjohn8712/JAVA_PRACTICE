import java.util.Scanner;
//import java.util.InputMismatchException;

class ArithmeticExcep extends Exception{

public static void main(String[] args){
ArithmeticExcep obj=new ArithmeticExcep();
Scanner sc=new Scanner(System.in);
int a=0;
int b=0;
System.out.println("Enter a value");
 a=sc.nextInt();
System.out.println("Enter b  value");
 b=sc.nextInt();
obj.add(a,b);
}
public void add(int a,int b){
    try{
System.out.println(a/b);
    }catch(Exception e){
        System.out.println(e.getCause());
    }finally{
        System.out.println("Finally block");
    }


}

}