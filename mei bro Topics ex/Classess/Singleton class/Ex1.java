class Singleton{
 static Singleton s=null;
  String name="vijay";
 
 private Singleton(){

 }

 static Singleton getInstance(){
    if(s==null)
    s=new Singleton();
    return s;
 }


}



class Ex1{
  static  Singleton s1;
    public static void main(String[] args) {
        // Singleton s=new Singleton();
         s1=Singleton.getInstance();
        s1.name="john";
       Ex2.main();
    }
    void print(){
        System.out.println( s1.name);

    }

}

class Ex2{
    static void main(){

        Singleton s2=Singleton.getInstance();
        System.out.println(s2.name="jacob");

        Ex1 ex=new Ex1();
        ex.print();
    }
}