// private interface EmpolyeeRules --> can't be private or protected.


interface EmpolyeeRules{  // can compile ex: javac EmpolyeeRules.java
int salary =25000;      //that var are by default, final and static
int leaves=10;

//private int leaves=10;  //error can't be private and protected.
//protected public void maintainHours(); -->/error can't be nd protected.

public void maintainHours();  //by default, they are abstract.
public void relocate();       
public void report();
public void dress();
}

interface FamilyRules{
public void takeCareParents();
public void helpMembers();
public void eatTogether();
public void enjoy();
}
public class ABCEmployee implements EmpolyeeRules,FamilyRules{
public static void main(String args[]){
ABCEmployee  abc=new  ABCEmployee ();
//EmpolyeeRules:
abc.maintainHours();
abc.relocate();
abc.report();
abc.dress();
//abc.salary=35000;
//abc.leaves=20;
System.out.println(salary); // or(EmpolyeeRules.salary) or (ABCEmployee.slary). because abstract var are default final and static.
System.out.println(leaves); // or (EmpolyeeRules.leaves) or (ABCEmployee.leaves)


//FamilyRules
abc.takeCareParents();
abc.helpMembers();
abc.eatTogether();
abc.enjoy();

FamilyRules father=new ABCEmployee();
father.eatTogether();
//father.report(); -->accure error.only access relevented of FamilyRules.
//father.abcClass(); -->accure error
}
//FamilyRules:
public void takeCareParents(){System.out.println("takeCareParents");}
public void helpMembers(){System.out.println("helpMembers");}
public void eatTogether(){System.out.println("eatTogether");}
public void enjoy(){System.out.println("enjoy");}

//EmpolyeeRules:
public void maintainHours(){System.out.println("40 Hourse");}
public void relocate(){System.out.println("Other City");}
public void report(){System.out.println("Manager");}
public void dress(){System.out.println("Neatly");}

//ABCEmployee Method:
public void abcClass(){
System.out.println("ABC Employee");
}
}