import java.util.*;
class Fibbanocci{
public static void main(String args[]){
    int a=-1;
    int b=1;
    int fib=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number:");
    int c=sc.nextInt();
    for(int i=1;i<=c;i++){
       fib=a+b;
       a=b;
       b=fib; 
          System.out.println("Fibanocci Series is :");
        System.out.println(fib);
    }
   
}
}


