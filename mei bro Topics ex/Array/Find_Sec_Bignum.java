class Find_Sec_Bignum{
public static void main(String args[]){
int arr[]={9,10,7,11,5,6,7,8};

int temp;
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr.length;j++){
if(arr[i]>arr[j]){
temp=arr[j];
arr[j]=arr[i];
arr[i]=temp;
}



}
}
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}

}
}

