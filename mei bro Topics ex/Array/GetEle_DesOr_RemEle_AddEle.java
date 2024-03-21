import java.util.Scanner;

class GetEle_DesOr_RemEle_AddEle{


// method -> Convert descending:-----------

static void descending(int userInputArray[],int arrLength){
for(int i=0;i<arrLength;i++){
for(int j=0;j<arrLength;j++){
if(userInputArray[i]>userInputArray[j]){
int temp=userInputArray[j];
userInputArray[j]=userInputArray[i];
userInputArray[i]=temp;
}
}
}
}

//Method -> checkElementisExist or not:------------

static int[] checkElementisExist(int userInputArray[],int addElement,int arrLength,int removeElement){
for(int i=0;i<arrLength;i++){
if(userInputArray[i]==addElement){
return null;
}}

for(int i=0;i<arrLength;i++){
if(i==removeElement){
userInputArray[i]=addElement;
}
}
return userInputArray;}






//Main method:--------

public static void main(String []args){

//Get input from user:

int temp=0;
Scanner sc=new Scanner(System.in);
System.out.println("How many values your want insert:");
int arrLength=sc.nextInt();
int userInputArray[]=new int[arrLength];
System.out.println("Enter  values:");
for(int i=0;i<arrLength;i++){
userInputArray[i]=sc.nextInt();
}


//Sort descending order From array:

descending(userInputArray,arrLength);  //call a method

System.out.println("Sort in Descending Order: ");
for(int i=0;i<arrLength;i++){
System.out.println(userInputArray[i]);
}

//Remove particular array index and Add Element:

System.out.println("Enter a Remove Element index: 0 to "+(arrLength-1));
int removeElement=sc.nextInt();
System.out.println("Enter one value: ");
int addElement=sc.nextInt();

int[] resultArray=checkElementisExist(userInputArray,addElement,arrLength,removeElement);
boolean boolVal=true;
while(boolVal){

if(resultArray==null){
System.out.println("value already exists,Enter another one value: ");
 addElement=sc.nextInt();
resultArray=checkElementisExist(userInputArray,addElement,arrLength,removeElement);
}
else{boolVal=false;}
}



//Sort descending order After add element:

descending(userInputArray,arrLength);  //call a method

System.out.println("after Remove Element in a Array and sort descending order: ");
for(int i=0;i<resultArray.length;i++){
System.out.println(resultArray[i]);
}

}
}
