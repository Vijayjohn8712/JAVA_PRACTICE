//Recursive Method:

class Task_Method6_Fact{

static int factorial(int num){
if(num>1){
return (num*factorial(num-1));
}
else {
return 1;
}
}

public static void main(String args[]){
int result=factorial(5);
System.out.println(result);
}
}




