
class Parent{
int salary=2000;
 void play(){
System.out.println("Playing");
}
}

class Child extends Parent{
void play(){
System.out.println("Watching TV");
}
}

class Inheritance{
public static void main(String args[]){
Child ch=new Child();
ch.play();
}
}