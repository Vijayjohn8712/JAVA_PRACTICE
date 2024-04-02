

public class User {
    public static void main(String[] args) {
       Mobile mobile=new Mobile();
       mobile.call();
       Mobile smartPhone=new Mobile(){
            public void call(){
                System.out.println("Call,Access NetWorking,Chatting,Video calling");
            }
       };
       smartPhone.call();
       
    }
  
}


class Mobile{
    public void call(){
        System.out.println("calling");
    }
}