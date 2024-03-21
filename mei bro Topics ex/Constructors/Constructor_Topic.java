
class Somecls{
public void  printHlo(){
System.out.println("printHlo");
}
}


class Constructor_Topic{
Constructor_Topic(){
System.out.println("Hai");
}
/*Constructor_Topic(String str){
System.out.println(str);
}
Constructor_Topic(Somecls obj){
obj.printHlo();
}*/

void Somecls2(){
obj.printHlo();
}

public static void main(String []args){
new Constructor_Topic();                     //non-parameterized
//Constructor_Topic m=new Constructor_Topic("H r u");  //parameterized
Somecls m=new Somecls();
new Constructor_Topic(m);     //->copy constructor
}
}