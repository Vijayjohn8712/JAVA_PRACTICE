
class Remove_Array_AtEnd{
public static void main(String[] args){
int  arr[]={2,3,4,5,6,7,8};
int newArray[]=new int[arr.length-1];
int i;

for(i=0;i<arr.length-1;i++){
newArray[i]=arr[i];
}
for(i=0;i<newArray.length;i++){
System.out.print(newArray[i]);
}
}
}