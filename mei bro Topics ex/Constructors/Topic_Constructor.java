class Topic_Constructor{
private  String  name;
private  int id; 
Topic_Constructor(String n,int num){
System.out.println("Par constructor");
name=n;
id=num;
System.out.println(name);
System.out.println(id);
}

Topic_Constructor(){
System.out.println("Default constructor");
name = "Vijay";
id = 123;
System.out.println(name);
System.out.println(id);
}

void call_parConstructor(){

System.out.println(name);
System.out.println(id);
}

public static void main(String []args){
Topic_Constructor n=new Topic_Constructor("john",1234);
Topic_Constructor m=new Topic_Constructor("vino",12);
//new Topic_Constructor();
n.call_parConstructor();
System.out.println(m.name);
System.out.println(n.id);
}
}