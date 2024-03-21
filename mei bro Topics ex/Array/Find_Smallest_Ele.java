class Find_Smallest_Ele{
public static void main(String[] args){
int arr[]={10,11,3,12,5,6,2,7,8};
int temp=arr[0];

for(int i=0;i<arr.length;i++){

if(temp>arr[i]){
temp=arr[i];
}

}
System.out.print(temp);
}
}