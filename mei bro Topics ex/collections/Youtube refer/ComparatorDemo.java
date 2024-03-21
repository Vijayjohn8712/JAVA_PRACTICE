import java.util.Arrays;
import java.util.Comparator;
class ComparatorDemo{
    public static void main(String []args){
        String []name={"vijay","john","vinoth kumar","affan","dinesh"};
        Arrays.sort(name);
        for(String s:name){
        System.out.println(s);
        }  
      Comparator comp=new  ExtendsComparatorClass(); //Comparator<String>
      Arrays.sort(name,comp);
      System.out.println("After Compare:");
         for(String st:name){
        System.out.println(st);
    }
    
    }
}

//Comparator usage of sort the element in ascending or descending oder.
class ExtendsComparatorClass implements Comparator{  // typecasting can have Comparator<String>

    public int compare(Object o1,Object o2){  //      public int compare(String o1,String o2){
        String s1=(String)o1; //typecaste
        String s2=o2.toString(); //typecaste
        if(s1.length()>s2.length()){
            return -1;
        }else if(s1.length()<s2.length()){
            return +1;
        }
        else{
            return 0;
        }
    }
}