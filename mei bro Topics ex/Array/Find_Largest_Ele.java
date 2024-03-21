class Find_Largest_Ele{
public static void main(String[] args){
int arr[]={11,3,13,5,6,7,18};
int temp=arr[0];;
for(int i=0;i<arr.length;i++){
if(temp<arr[i]){
temp=arr[i];
}
}

System.out.print(temp);
}
}