class Find_Sec_Smallnum{
public static void main(String args[]){
int arr[]={9,10,7,11,5,6,4,8};

int temp=0;
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr.length;j++){
if(arr[i]<arr[j] && i!=j){
temp=arr[j];
arr[j]=arr[i];
arr[i]=temp;
}
}
}
System.out.println("The Second Smallest Number is: " + arr[1]);

}
}
