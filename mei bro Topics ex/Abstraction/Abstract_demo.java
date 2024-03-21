public class Abstract_demo extends Abs{
public int add(int a,int b){
return a+b;
}
public static void main(String []args){
 Abstract_demo obj=new Abstract_demo();
System.out.println(obj.add(5,10));
System.out.println(obj.mul(5,10));
}
}

abstract class Abs{
abstract int add(int a,int b);
public int mul(int c,int d){
return c*d;
}
}