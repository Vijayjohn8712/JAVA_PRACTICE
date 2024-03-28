//Count of each character

import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) {
        String s="ammaappa";
        HashMap<Character,Integer> charcount=new HashMap<>();
        char[] ch=s.toCharArray();

        for(char c:ch){
            if(charcount.containsKey(c))
            charcount.put(c,charcount.get(c)+1);
            else
            charcount.put(c,1);
        }
        System.out.println(charcount);

    }
    
}
