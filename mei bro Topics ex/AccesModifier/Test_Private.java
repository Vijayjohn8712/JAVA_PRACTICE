class Test_Private{
public static void main(String[] args){
Private obj=new Private();
System.out.print(obj.name);
Protected obj1=new Protected();
System.out.print(obj1.name);
}
}
class Private{
private String name="john";
}

class Protected{
protected String name="vijay";
}