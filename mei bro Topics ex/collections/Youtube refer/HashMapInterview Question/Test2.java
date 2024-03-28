//print only of dupicate character

import java.util.HashMap;
import java.util.*;

public class Test2 {
public static void main(String[] args) {
    String s="vishalsubbram";
    HashMap<Character,Integer> hm=new HashMap<>();
    char[] ch=s.toCharArray();
    for(char c:ch)
    if(hm.containsKey(c)){
    hm.put(c,hm.get(c)+1);
    } 
    else
      hm.put(c,1);

          Set<Map.Entry<Character,Integer>> se=hm.entrySet();

          for( Map.Entry<Character,Integer> entry:se){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+"-"+entry.getValue());
            }
          }
}
    
}
