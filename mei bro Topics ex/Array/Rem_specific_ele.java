import java.io.Console;
class Rem_specific_ele{
public static void main(String[] args){
int num,i;
int arr[]={1,2,3,4,5,6,7,8};
int newArr[]=new int[arr.length-1];
Console console=System.console();
num=Integer.parseInt(console.readLine("Enter a Remove num 1 to 8: "));
for(i=0;i<arr.length;i++){
if(num==arr[i]){
for(i=i;i<newArr.length;i++){
newArr[i]=arr[i+1];
}
break;
}else{
newArr[i]=arr[i];
}
}

for(i=0;i<newArr.length;i++){
System.out.println(newArr[i]);
}

}
}