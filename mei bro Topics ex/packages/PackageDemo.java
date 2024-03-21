package org.excercise;
import org.test1.*;


public class PackageDemo{
  public  void printHlo(){System.out.println("hello package");}
public static void main(String[] args){
   
    ImportChild obj=new ImportChild();
    
    System.out.println(obj.add(10,20));

}


}