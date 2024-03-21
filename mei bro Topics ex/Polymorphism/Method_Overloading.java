class Method_Overloading{
int add(int a){
return a+5;
}

int add(int a,int b){
return a+b;
}
double add(double a,double b){
return a+b;
}
public static void main(String[] args){
Method_Overloading m=new Method_Overloading();
int passOneint=m.add(5);
int passIntvalue=m.add(5,7);
double passDoublevalue=m.add(123.2344,654.34666);

System.out.println(passOneint);
System.out.println( passIntvalue);
System.out.println(passDoublevalue);
}
}