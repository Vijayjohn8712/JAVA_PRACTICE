import java.io.File;

public class Ex2 {
    public static void main(String[] args) {
        Singleton s=Singleton.init();
        System.out.println(s.setData("vijay"));

        Singleton s1=Singleton.init();
        System.out.println(s1.setData("vijay"));

        System.out.println(s);
        System.out.println(s1);
    }
}


class Singleton{
    private String data;
    private File file;

    private Singleton(){

    }

    public static Singleton init(){
        return new Singleton();
    }

    public Singleton setData(String info){
        data=info;
        return this;
    }

    // public String toString(){
    //     return ""+this.data;
    // }
    // public static Singleton getData(){
    //     return data;
    // }

    // public Singleton initializeFile(String filepath){
    //     file=new File(filepath);
    //     return this;
    // }
}