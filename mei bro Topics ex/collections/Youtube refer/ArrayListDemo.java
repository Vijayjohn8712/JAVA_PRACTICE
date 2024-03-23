import java.util.*;

class ArrayListDemo{
public static void main(String []args){
    //add
    ArrayList al=new ArrayList();
    al.add(5);
    al.add(6);
    al.add(8);
    al.add(1);
    al.add("Vijay");
    System.out.println("al List is"+al);

    ArrayList al2=new ArrayList();
    al2.addAll(al);
     System.out.println("al2 List is"+al2);

    ArrayList al3=new ArrayList(); 
    al3.add("New Delhi");
    al3.add("Chennai");
    al3.add("Mumbai");
    al3.add("Kolkata");
    al3.add("Chennai");
    System.out.println("chennai Index is " + al3.indexOf("Chennai"));
        System.out.println("chennai Last  Index is " + al3.lastIndexOf("Chennai"));

      System.out.println("al3 List is"+al3);

      al3.addAll(2,al);
        System.out.println("al3 after addition: "+al3);
    
    al3.removeAll(al);
      System.out.println("al1 after remove of al2 "+al3);

    List al4=al3.subList(0,3);
      System.out.println("al4 List is"+al4);
}
}