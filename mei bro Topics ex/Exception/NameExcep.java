import java.util.*;

class NameEXception extends Exception{
  public String getMessage(){
    return "exception occurred..";
  }
}

public class Main{
    public static void testThrow() throws NameException{
throw new NameEXception();
    }
    public static void main(String[] args){
        try{
            testThrow();
        }catch(NameException ne){
            System.out.println("Name Exception" + ne.getMessage());
        }catch(Exception e){
            System.out.println("Exception" + e.getMessage());
        }
    }
}