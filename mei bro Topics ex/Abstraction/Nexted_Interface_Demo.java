//Member interface or Nested interface.ex for a single person have own rules and follow.

class Interface_Demo{

public interface Rules{   // (or.can be) private interface Rules{
public void setName();
}
}


public class Nexted_Interface_Demo implements Interface_Demo.Rules{

public static void main(String[] args){

Nexted_Interface_Demo obj =new Nexted_Interface_Demo();

obj.setName();
obj.play();

//Dynamic binding:
Interface_Demo.Rules ref=new Nexted_Interface_Demo();
ref.setName();
//ref.play();
}

public void setName(){
System.out.println("Vijay");
}
public void play(){
System.out.println("playing");
}
}