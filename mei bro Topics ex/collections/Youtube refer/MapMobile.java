import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
public class MapMobile {
    static  public  void main(String []args){
        Mobiles mb1 = new Mobiles("samsung",8,10000);
        Mobiles mb2 = new Mobiles("vivo",12,12000);
        Mobiles mb3 = new Mobiles("samsung",6,11000);

        HashMap hm=new HashMap();
        hm.put(123,mb1);
        hm.put(124,mb2);
        hm.put(125,mb3);


        Set s=hm.entrySet();
        // System.out.println(s);

        Iterator iter=s.iterator();
        while(iter.hasNext()){
            // System.out.println(iter.next());
            Map.Entry me=(Map.Entry)iter.next();
            Object o1=me.getKey();
            Object o1Details=me.getValue();
            Mobiles m=(Mobiles)o1Details;
            if(o1.equals(123)){
            m.price=180000;
            }           

        }
        System.out.println(hm);


    }
}


 class Mobiles {
    String name;
    int price;
    int gb;
    

    public String toString(){
        return " "+this.name+":"+this.price+":"+ this.gb ;
    }

     public Mobiles(String name,int gb,int price){
        this.name=name;
     this.gb=gb;
     this.price=price;
   
     }
}
