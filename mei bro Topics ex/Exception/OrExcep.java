class OrExcep{

public static  void display(){
    try{
        int a=10,b=0,c=-5;
          System.out.println(a/b);
    int arr[]=new int[c];
  
    }catch(ArithmeticException | NegativeArraySizeException e){
        System.out.println(e.getMessage());
        System.out.println("Check Check Check");
    }
}

public static void main(String args[]){
    display();
}

}