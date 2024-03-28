import java.util.*;
class Collection3{
    public static void main(String[] args){

     //Stack:   
        Stack<String> st=new Stack<String>();
        st.push("Vijay");
        st.push("John");
        st.push("Vinoth");
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);
         

     //Queue:
     PriorityQueue<String> qu=new PriorityQueue<>();
     qu.offer("d");
     qu.offer("b");
     qu.offer("c");
     System.out.println(qu); 
     System.out.println(qu.peek());   
     System.out.println(qu.poll());
       System.out.println(qu);    

    //Deque:
    ArrayDeque<String> ar=new ArrayDeque<>();
    ar.offer("d");
    ar.offer("B");
    ar.offer("C");
    ar.offer("D");
    ar.offerFirst("E");
    ar.offerLast("F");
     System.out.println(ar);
       System.out.println(ar.poll());
         System.out.println(ar); 
         System.out.println(ar.pollFirst());
         System.out.println(ar.pollLast());
     System.out.println(ar.peek());   
       System.out.println(ar);    

 }

}