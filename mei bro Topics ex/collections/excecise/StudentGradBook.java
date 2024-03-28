
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;



import java.util.Map;


class StudentGradBook{

    public static void main(String[] args){

        GreadBookManager greadBookManager =new GreadBookManager();
        greadBookManager.manager();
    }
    }
   


class Students{
    String studentName;
   int id;

   public String getName(){
    return this.studentName;
   }

   public void setName(String newName){
    this.studentName=newName;
   }
   
   public int getId() {
	   return this.id;
   }
   public void setId(int id) {
	   this.id=id;
   }


}


class AssignmentsAndGread extends Students{
    int assignment;
    double grad;
    
    public int getAssignment() {
    	return this.assignment;
    }
    
    public void setAssignment(int assignment) {
    	this.assignment=assignment;
    }
    
    public void setGrad() {
    	this.grad=this.assignment;
    }
    
    
    
//    public void setGrad() {
//    	return grad;
//    }

}


class GreadBookManager extends AssignmentsAndGread{

String objStudentName;
ArrayList<GreadBookManager> li=new ArrayList<>();

// GreadBookManager greadBookManager =new GreadBookManager();



//manage Details:
 public void manager(){
System.out.println("<----------GreadBook Manager:------------>");
System.out.println("Options");
System.out.println("1.Enter Student Data's");
System.out.println("2.Modify Student Dats's");
System.out.println("3.view Student Dats's");
System.out.println("4.Exits"); 

    int option=new Scanner(System.in).nextInt();



switch (option) {
    case 1:
    InsetStudentDetails();
       break;

    case 2:
        System.out.println("what you want to modify the ");
        System.out.println("1.Student Name:");
        System.out.println("2.Student Assignment:");
        int modifyStudentDetails=new Scanner(System.in).nextInt();
//        Students st=new Students();
        switch(modifyStudentDetails){
            case 1:
            System.out.println("Which a name you want modify name:");
            String oldName=new Scanner(System.in).nextLine();
            System.out.println("Enter New Name: ");
            String  newName=new Scanner(System.in).nextLine(); 
            changeName(oldName,newName); 
            break;

            case 2:
            
              System.out.println("which  student assignment want to change: ");
              String existName=new Scanner(System.in).nextLine();
              System.out.println("Enter Recorrect Assignment Value: ");
              int newAssignment = new Scanner(System.in).nextInt();
              changeAssignment(existName,newAssignment);
              break;
        }
              
              
           break;
              
        
     case 3:
     viewStudentDetails();
     break;
     
    case 4:
        break;
    }
    
}

    public void  InsetStudentDetails(){

        
        Scanner reassignValue=new Scanner(System.in);
    
        //inset Student detail
        System.out.println("Enter Student Name:");
        String name=reassignValue.nextLine();
        objStudentName=name;
        GreadBookManager objStudentName =new GreadBookManager();
        objStudentName.setName(name);
       

        System.out.println("Enter Student Id:");
        int id=reassignValue.nextInt();
        objStudentName.setId(id);
      
    
        //inset gread
        System.out.println("How many  Assignment Student was Finished:");
        assignment=reassignValue.nextInt();
        objStudentName.setAssignment(assignment);
        objStudentName.setGrad();
        // System.out.println("Enter Student gread:")
        // double gread=reassignValue.nextDouble();
       
        li.add(objStudentName);

       manager();
    }



    public void viewStudentDetails(){
        System.out.println();
        System.out.println("<---------------Student Details:----------------->");
        // System.out.println(objStudentName);
        Iterator iter=li.iterator();
     

        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        manager();
    }

    public String toString(){
        return " Student_Name: "+this.studentName+ ",   Student_Id: "+this.id+", Student_Assignment : "+this.assignment+", Student_Grad : " + this.grad;
    }

    public void   changeName(String oldName,String newName){
    for(GreadBookManager s:li){
    if(s.getName().equals(oldName)){
        s.setName(newName);
        manager();

    }} }
    
    public void changeAssignment(String existName,int newAssignment) {
    	for(GreadBookManager as:li) {
    		if(as.getName().equals(existName)) {
    			as.setAssignment(newAssignment);
    	        manager();

    		}
    	}
    }

}