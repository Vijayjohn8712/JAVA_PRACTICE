
class A{
void printHello(){
System.out.println("Hello");
}
}

class B extends A{
void printHello(){
super.printHello();
System.out.println("Test");
}
/*
void test() {
super.printHello();
printHello();
}*/
}

class Method_Overriding{
public static void main(String[] args){
B obj=new B();
obj.printHello();
//obj.test();
}
}