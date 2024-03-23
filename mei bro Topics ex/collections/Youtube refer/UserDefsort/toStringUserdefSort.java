package UserDefsort;
import java.util.*;
import UserDefsort.examplecom.*;
import UserDefsort.exampllap.*;

public class toStringUserdefSort {
    public static void main(String[] args){
    Laptop dell=new Laptop(45000,8,true);
    Laptop lenovo=new Laptop(50000,6,false);
    Laptop hp=new Laptop(40000,16,true);
   
    ArrayList laptopList =new ArrayList();
    laptopList.add(dell);
    laptopList.add(lenovo);
    laptopList.add(hp);

    System.out.println("Before sorting: "+ laptopList);
    ComparatorDemo cd=new ComparatorDemo();
    Collection.sort(laptopList,cd);
    System.out.println("Before sorting: "+ laptopList);
}
}
