//class Methodoverloading{
  public class  Methodoverloading {
    int x;
     Methodoverloading(int x) {
        x = x;
    }
    public static void main(String[] args) {
        Methodoverloading obj = new  Methodoverloading(5);
        System.out.println(obj.x);
    }
}





/*class Methodoverloading
{
void add(int a , int b)
{
System.out.println(a+b);
}
void add(double a, double b)
{
System.out.println(a+b);
}

public static void main(String args[])
{
Methodoverloading m = new Methodoverloading();
m.add(10,20);
m.add(5.255,2.255);
}
}*/