

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {
public static void main(String[] args) {
	
	HashMap hm=new HashMap();
	hm.put("Suriya", 100);
	hm.put("vino", 101);
	hm.put("vijay", 102);
	
	System.out.println(hm);
	
	Set s=hm.keySet();
	System.out.println(s);
	
	Collection c=hm.values();
	System.out.println(c);
	
	Set es=hm.entrySet();
	System.out.println(es);
	
	System.out.println(hm.containsKey("vino"));
	System.out.println(hm.containsValue("200"));
	
	Iterator i=es.iterator();
	while(i.hasNext()) {
		Map.Entry me=(Map.Entry)i.next(); 
//		System.out.println(i.next());    -->i.next() return datatype is Object class Obj.
//		System.out.println(me.getKey() +" : "+me.getValue());
		if(me.getKey().equals("vino")) {
//			System.out.println(me.getValue());
			me.setValue(200);
		}
		System.out.println("after set value "+me);
	}
	
	
	//TreeMap
	
	TreeMap tm=new TreeMap();
	tm.put(101,"vijay");
	tm.put(105,"john");
	tm.put(103,"vino");
	tm.put(102,"affan");
	System.out.println(tm);
	
	TreeMap tm2=new TreeMap();
	tm2.putAll(tm);
	System.out.println(tm2);
	
	System.out.println(tm2.firstEntry());
	System.out.println(tm2.lastEntry());
	

}
}

