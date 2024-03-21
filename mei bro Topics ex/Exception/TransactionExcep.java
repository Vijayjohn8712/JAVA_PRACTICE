
class TransactionExcep{
public static void main(String args[]){
    Transaction tr=new Transaction();
    tr.getDetails();

}
private void getDetails(){
Scanner sc=new Scanner(System.in);
try{
    System.out.println("Enter Account Number ");
    int accNo=sc.nextInt();
    System.out.println("Enter PIN Number ");
    int pin=sc.nextInt();
    System.out.println("Enter array length");
    int arrLength=sc.nextInt();
    int[] empDetails=new int[arrLength];

    for(int i=0;i<10;i++){
       empDetails[i]=20000;
    }
    System.out.println(accNo/pin);
}
    catch(InputMismatchException ime){
        System.out.println("Check your account no/pin Number");
    }
    catch(ArrayIndexOutOfBoundsException ai){
        System.out.println("Check Array Length");
    }
    catch(Exception e){
        System.out.println(e);
    }
    finally{

        System.out.prinln("Close my Transaction")
    }
}



}

}

