interface Calc{
int add(int a,int b);
int sub(int a,int b);
int div(int c,int d);
}

public class Interface_Demo implements Calc{
public int add(int a,int b){
return a+b;
}
public int sub(int a,int b){
return a-b;
}
public int div(int c,int d){
return c/d;
}

public static void main(String[] args){
Calc obj=new Interface_Demo();
System.out.println(obj.add(5,10));
System.out.println(obj.sub(20,10));
System.out.println(obj.div(35,10));
}}

