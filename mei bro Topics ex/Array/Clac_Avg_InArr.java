class Clac_Avg_InArr{
public static void main(String[] args){
int arr[]={1,3,4,5,6,7,8};
double Avg=0;
 int Total=0;
for(int i=0;i<arr.length;i++){
Total=Total+arr[i];
}
Avg=Total/arr.length;
System.out.print(Avg);
}
}