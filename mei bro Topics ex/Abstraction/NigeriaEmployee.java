//Sub interface:

interface EmpolyeeRules{  
int salary =25000;      
int leaves=10;

public void maintainHours();  
public void relocate();       
public void report();
}


interface EmployeeRulesNigeria extends EmpolyeeRules{
int salary =35000;  //can overrid in interface to interface.
public void dress();
public void giveSalary();
}


public class NigeriaEmployee implements EmployeeRulesNigeria{
public static void main(String[] args){
 NigeriaEmployee  ne=new  NigeriaEmployee();
System.out.println(ne.salary);
}
public void dress(){}
public void giveSalary(){}
public void maintainHours(){} 
public void relocate(){}   
public void report(){}

}