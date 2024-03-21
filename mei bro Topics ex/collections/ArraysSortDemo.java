// Use comparator interface
import java.util.*;

class ArraysSortDemo{
    public static void main(String args[]){
    int[] no={9,3,18,2,1};
    for(int i:no)
    System.out.print(i);
     System.out.println();

    Arrays.sort(no);
   for(int i:no)
   System.out.print(i);
   System.out.println();

   String[] st={"P","A","Y"};
   for(String s:st)
   System.out.print(s);
    System.out.println();
   
   Arrays.sort(st);

   Arrays.sort(st,new ComparatorInterface());
   for(String s:st)
   System.out.print(s);
    }
}

class ComparatorInterface implements Comparator<Object>{
public int compare(Object o1,Object o2){
    String s1=o1.toString();
    String s2=o2.toString();
    return s2.compareTo(s1);
}

}



// import java.util.*;

// class ArraysSortDemo {
//     public static void main(String args[]) {
//         int[] no = {9, 3, 18, 2, 1};
//         for (int i : no)
//             System.out.print(i);
//               System.out.println();

//         Arrays.sort(no);
//         for (int i : no)
//             System.out.print(i);
//               System.out.println();

//         String[] st = {"P", "A", "y"};
//         for (String s : st)
//             System.out.print(s);
//               System.out.println();

//         Arrays.sort(st, new ComparatorInterface());
//         for (String s : st)
//             System.out.print(s);
//     }
// }

// class ComparatorInterface implements Comparator<Object> {
//     public int compare(Object o1, Object o2) {
//         String s1 = o1.toString();
//         String s2 = o2.toString();
//         return s2.compareTo(s1);
//     }
// }
