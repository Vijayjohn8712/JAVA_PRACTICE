
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
public class Test3 {
    static public void main(String[] args){
    String names="vijay vinoth dinesh affan dinesh vinoth vinoth";
    String[] words=names.split(" ");

    HashMap<String,Integer> hm=new HashMap<>(); 

   

    for(String word:words){
        if(hm.containsKey(word))
        hm.put(word,hm.get(word)+1);
        else
        hm.put(word,1);
    }
    System.out.println(hm);

  Set< Map.Entry<String,Integer>> entry= hm.entrySet();
  for( Map.Entry<String,Integer> e:entry){
    if(e.getValue()>1){
        System.out.println(e.getKey()+"-"+e.getValue());
    }
  }
}
}
