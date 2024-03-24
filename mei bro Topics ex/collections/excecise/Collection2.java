import java.util.*;

public class Collection2{
    public static void main(String args[]){

//List:
    ArrayList<String> arrList=new ArrayList<String>();
    arrList.add("a");
    arrList.add("b");
    arrList.add("c");
      System.out.println(arrList);

      //subList:
      List l=arrList.subList(1,3);
      System.out.println("Sub List -->"+ l);

    LinkedList<Integer> liArrList=new LinkedList<>();
    liArrList.add(1);
    liArrList.add(2);
    liArrList.add(3);
      System.out.println(liArrList);

      System.out.println("Get value "+liArrList.get(0));
       System.out.println("Remove value "+liArrList.remove(0));
       System.out.println(liArrList.remove((Integer) 2 )); 
         System.out.println("After Remove");

         System.out.println(liArrList);
         System.out.println("Contains "+ liArrList.contains(3));

         //remove value ,but that value also is integer EX:remove((Integer) 2 );  or (Integer.valueOF(2));

//Set:
     HashSet<String> hs=new HashSet<>();
     hs.add("A");
     hs.add("B");
     hs.add("C");
       System.out.println(hs);


      LinkedHashSet<String> list=new LinkedHashSet<String>(arrList);
      list.add("D");
      list.add("E");
      list.add("F");
      System.out.println(list);

      TreeSet<String> ts=new TreeSet<>();
      ts.add("G");
      ts.add("H");
      ts.add("I");
      ts.add("J");
      ts.add("K");
      ts.add("B");
      ts.add("C");
      System.out.println("befor headset"+ts);
      System.out.println(ts.headSet("H"));
      System.out.println(ts.tailSet("H"));
      System.out.println("Subset Elements are"+ts.subSet( "C","K"));


       System.out.println("Contains Set "+ ts.contains("I"));
        ts.clear();
      System.out.println(ts);
      System.out.println("ts tree set is Empty? " +ts.isEmpty());

      //Advance loop:
      System.out.println("Advanced Loop");
      for(String val:ts){
        System.out.println(val);
      }

      //Iterator:
      System.out.println("Iterator");
      Iterator iter=ts.iterator();
      while(iter.hasNext()){
        System.out.println(iter.next());
      }
      System.out.println("Size Of "+ts.size());
//Map:

      HashMap<String,String> map=new HashMap<>();
      map.put("Name","Vijay");
      map.put("Age","21");
      map.put("Class","Java");
      System.out.println(map);

      LinkedHashMap<String,String> lhm=new LinkedHashMap<>();
      lhm.put("Name","Vinoth");
      lhm.put("Age","20");
      lhm.put("Class","Java");
      System.out.println(lhm);

       System.out.println("Contains Map "+ lhm.containsKey("Name"));

      TreeMap<String,String> tm=new TreeMap<>();
      tm.put("Name","Affan");
      tm.put("Age","20");
      tm.put("Class","Java");
      System.out.println(tm);
    
     

     System.out.println("Map get Age  "+tm.get("Age"));
     System.out.println("Map remove Age "+ tm.remove("Age"));
      System.out.println("After Remove :");
       System.out.println(tm);
       tm.clear();
      System.out.println(tm);
 }
}