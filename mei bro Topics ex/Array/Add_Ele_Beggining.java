class Add_Ele_Beggining{
public static void main(String[] args){
int arr[]={2,4,5,6,7,9};
int newArr[]=new int[arr.length+1];
int addElement=1;
int i;
newArr[0]=addElement;
for(i=0;i<arr.length;i++){
newArr[i+1]=arr[i];
}

for(i=0;i<newArr.length;i++){
System.out.println(newArr[i]);
}
}
}