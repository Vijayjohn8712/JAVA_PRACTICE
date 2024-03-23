import java.util.*;

class LinkedListDemo{
    public static void main(String[] args){
     LinkedList ll=new LinkedList();
     ll.add(5);
     ll.add(6);
     ll.add(7);
     ll.add("Vijay");
     ll.add(8);
     System.out.println(ll);

     ll.addFirst("John");
     ll.addLast(9);
      System.out.println(ll);
      ll.removeFirst();
        System.out.println("after remove"+ll);
        System.out.println(ll.poll());
         System.out.println("after poll"+ll);   //remove and poll work in same.can  pollFirst() / pollLast()
        System.out.println(ll.peek());
    }
}