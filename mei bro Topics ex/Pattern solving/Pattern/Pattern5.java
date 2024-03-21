import java.util.*;

class Pattern5{
    public static void main(String[] args){
        
        
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       long startTime = System.currentTimeMillis();
         System.out.println(startTime);
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j==1 || j==num || ((i==j || (i+j)==num+1)&&(i<=(num/2)+1))){
                    System.out.print("*");
                }
               
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
         long endTime = System.currentTimeMillis();
          System.out.println("Execution time is "+ (endTime-startTime));
    }
}