//Dynamic Binding:


public class SubClass extends SuperClass{
public static void main(String[] args){

SuperClass obj=new SubClass();

//System.out.println(obj.hi());
obj.hlo();
String name ="john";

}


void myName(){
System.out.println("My Name is vijay ");
}

}
//-------------------------------------------------------

class SuperClass{

String name="Vijay";
void hi()
{
System.out.println("hi");
}
void hlo()
{
System.out.println("hlo vj");
}
}