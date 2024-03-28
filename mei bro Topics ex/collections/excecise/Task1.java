

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Task1 {
 public static void main(String[] args) {

    // ArrayList al=new ArrayList();
    LinkedList<Integer> al=new LinkedList<>();
    al.add(5);
    al.add(7);
    al.add(6);
    al.add(1);
    al.add(8);
    al.add(4);

    Collections.sort(al);
    System.out.println(al.get(al.size()-1));

    
}
}



// class ComparatorDemo implements Comparator{
 
//     public int compare(Object o1,Object o2){
//         int n1=(Integer)o1;
//         int n2=(Integer)o2;
//         if(n1>n2){
//             return +1;
//         }
//         else if(n1<n2){
//             return -1;
//         }
//         else{
//             return 0;
//         }
//     }

// }
