import java.util.*;

class Pattern{
    static public void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
             System.out.print("*");
            }
           System.out.println();        
        }
    }
}