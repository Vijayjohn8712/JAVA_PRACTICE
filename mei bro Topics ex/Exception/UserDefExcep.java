import java.util.*;

class NameEXception extends Exception{
    // NameEXception(){
    //     super("illegal Name Error");
    // }
  public String getMessage(){
    return "illigalNameException";
  }
}


class UserDefExcep{
    // public static void validateName(String name)throws NameEXception{
    //     if(name=="mei"){
    //         throw new NameEXception();
    //     }
    // }
public static void main(String args[]){

String name="mei";
try{
    // validateName(name);
    throw new NameEXception();
}catch(NameEXception ne){
    System.out.println(ne.getMessage());
    ne.printStackTrace();
}catch(Exception e){
    System.out.println(e);
}
}
}