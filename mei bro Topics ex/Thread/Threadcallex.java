public class Threadcallex extends ChildThread{
  public static void main(String[] args){
    ChildThread ct=new ChildThread();
    ct.test();

    Threadcallex te=new Threadcallex();
    te.test();
  }

  public void display(){
        System.out.println("Threadcallex");
  }
}


class ChildThread{
    public void test(){
        display();
    }
    public void display(){
        System.out.println("ChildThread");

    }
}