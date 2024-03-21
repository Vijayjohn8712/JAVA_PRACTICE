import java.util.*;
class ThrowsExcep{
    static  public void  main(String args[])
    {
      ThrowsMethod obj=new ThrowsMethod();
    //   try{
    // obj.calc();
    //   }catch(InputMismatchException ie){
    //     System.out.println("Please give numbers");
    //   }
    //   catch(ArithmeticException ae){
    //     System.out.println("Please dont give number of \"0\" ");
    //   }

   // obj.calc();
   try{
    ThrowsExcep te=new ThrowsExcep();
     te.display();
   }catch(Exception e){System.out.println(e);}
    System.out.println("End of the Program.");
    }

  void display() throws Exception{
ThrowsMethod obj1=new ThrowsMethod();
obj1.calc();

 }   
}


class ThrowsMethodey{

    public void calc()throws Exception{ //ArithmeticException,InputMismatchException{  //Exception class is achecked exception so compiler exception thrown at compile time.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int no1=sc.nextInt();
        int no2=sc.nextInt();
        System.out.println(no1/no2);

    }
}