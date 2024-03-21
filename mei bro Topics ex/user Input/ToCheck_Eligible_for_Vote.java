class ToCheck_Eligible_for_Vote{
public static void main(String[] args){
String name=args[0];
int age= Integer.parseInt(args[1]);
String arr3=args[3];
if(age>18){
System.out.println(name + " Age is " +age +" -> Your Eligible for vote" );
}else{
System.out.println(name + " Age is " +age +" -> Your Not Eligible for vote" );
}
System.out.println(arr3);
}
}