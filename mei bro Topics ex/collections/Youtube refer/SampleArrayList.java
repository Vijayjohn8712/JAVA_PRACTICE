import java.util.*;
class SampleArrayList{
static public  void main(String[] args){
    ArrayList  al=new ArrayList();
    System.out.println("ArrayList size"+ al.size());
    al.add("A");
    al.add("ABC");
    al.add(5);
    System.out.println("Now isze"+al.size());
  System.out.println(al);
  al.add("A");
  System.out.println(al);
  al.remove("ABC");
  System.out.println(al);
  al.addAll(al);
  System.out.println(al);
} 
}