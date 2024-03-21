import java.util.*;

public class Collection1{
    public static void main(String args[]){
    String[] arr={"a","b","c","a","b","c"};
    System.out.println(arr);

    ArrayList<String> arrList=new ArrayList<String>(Arrays.asList(arr));
      System.out.println(arrList);

      LinkedHashSet<String> list=new LinkedHashSet<String>(arrList);
      list.add("A");
      list.add("D");
      list.add("A");
      System.out.println(list);

      HashMap<String,String> map=new HashMap<>();
      map.put("Name","Vijay");
      map.put("Age","21");
      map.put("Class","Java");
      System.out.println(map);
      
 }
}