import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class toStringUerDEfex{
    public static void main(String[] args){
    Laptop dell=new Laptop("Inspiron",45000,8,true);
    Laptop lenovo=new Laptop("Ideapad",50000,16,false);
    Laptop hp=new Laptop("Pavilion",50000,6,true);
   
    ArrayList laptopList =new ArrayList();
    laptopList.add(dell);
    laptopList.add(lenovo);
    laptopList.add(hp);

    System.out.println("Before sorting: "+ laptopList);
    ComparatorDemo cd=new ComparatorDemo();
    Collections.sort(laptopList,cd);
    System.out.println("Before sorting: "+ laptopList);
}
}

//Laptop:
 class Laptop {
    String model;
    int price;
    int gb;
    boolean touch;

    public String toString(){
        return ""+this.model+"-"+this.price+"-"+this.gb+"-"+this.touch;
    }

     public Laptop(String model,int price,int gb,boolean touch){
     this.model=model;
        this.price=price;
     this.gb=gb;
     this.touch=touch;
     }
}

//Comparator:
class ComparatorDemo implements Comparator {

    public int compare(Object o1,Object o2){
        Laptop l1=(Laptop)o1;
        Laptop l2=(Laptop)o2;
        //price wise:
        // if(l1.price>l2.price){
        //     return +1;
        // }
        // else if(l1.price<l2.price){
        //     return -1;
        // }
        // else{
        //     if(l1.gb>l2.gb){
        //         return +1;
        //     }
        //     else if(l1.gb<l2.gb){
        //         return -1;
        //     }
        // }
        //   return 0;

        // model wise:
       int result=l1.model.compareTo(l2.model);
        if(result>0){
            return +1;
        }
        else if(result<0){
            return -1;
        }

        return 0;

    }
}
