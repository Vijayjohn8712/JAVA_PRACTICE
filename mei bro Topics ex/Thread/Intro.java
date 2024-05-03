public class Intro {
    public static void main(String[] args) {
        Threadex tx=new Threadex();
        // System.out.println(tx.getState());

        tx.start();
        for(int i=1;i<5;i++){
            System.out.println("main");
        }
    }

}


class Threadex extends Thread{
    
public void run(){
    for(int i=1;i<5;i++){
        System.out.println("Thread");
    }
    // System.out.println(tx.getState());

}
}