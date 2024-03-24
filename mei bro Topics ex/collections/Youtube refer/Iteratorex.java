import java.util.*;
public class Iteratorex {
    public static void main(String[] args) {
        ArrayList names=new ArrayList();
        names.add("vishal");
        names.add("suriya");
        names.add("nithish");
        names.add("suresh");
        names.add(5);

        System.out.println(names);
         
      for (Object obj : names) {
        System.out.println(obj);
      }
       //Iterator:
    Iterator iter=names.iterator();
    while(iter.hasNext()){
        if(iter.next().equals("nithish")){
            iter.remove();
        }  
        // System.out.println("iter values :"+iter.next());
    }
    System.out.println("after remove iterator: "+names);

    // ListIterator:
    ListIterator liter=names.listIterator();
    liter.add("nithish");
    while(liter.hasNext()){
        if(liter.next()=="suresh"){
            // System.out.println("previous iter is :"+liter.previous());
         liter.set("mathis");
         System.out.println("previous iter Index is :"+liter.previousIndex());

        }
        // System.out.println(liter.next());
    }
    System.out.println("Literator: "+names);

    }
}
