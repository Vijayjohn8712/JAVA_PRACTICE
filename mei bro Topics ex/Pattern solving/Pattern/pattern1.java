import java.util.*;

class Pattern1{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
for(int i=num;i>=1;i--){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}

}

}