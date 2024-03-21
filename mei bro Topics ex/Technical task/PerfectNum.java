import java.util.*;


class PerfectNum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        isPerfectNum(num);
    }
    public static void  isPerfectNum(int num){
        int perfect=0,i=1;

        while( perfect<=num)
        {
         perfect=i+perfect;
         i++;
        }
        // (perfect==num) ? System.out.pritnln("Perfect Number"):System.out.println("Not Perfect Number");
    int perfectNumber= (perfect==num ) ? "Perfect Number":"Not Perfect Number";
    System.out.println(perfectNumber);
    }
}