import java.util.*;
class ArrayListToArray{
public static void main(String args[]){
    ArrayList<Integer> al=new ArrayList<Integer>();
    Scanner sc=new Scanner(System.in);
    System.out.println("You want to inset a Element Write\" Yes/ No\"");
   char ch=sc.next().charAt(0);
   int i=1;
   while(ch=='Y' || ch=='y'){
   al.add(i);
   i++;
    System.out.println("You want to again inset a Element Write\" Yes/No\"");
       ch=sc.next().charAt(0);
   }
System.out.println(al);
Integer arr[]=new Integer[al.size()];
arr=al.toArray(arr);
for(int el:arr)
System.out.println(el);

}
}