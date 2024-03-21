class Besant_Information{
private String studentName;
private String trinerName;
private String course;
private int courseFees;
private String duration;
private String branch;

public String getStudentName(){return studentName;}
public String getTrinerName(){return trinerName;}
public String getCourse(){return course;}
public int    getCourseFees(){return courseFees;}
public String getduration(){return duration;}
public String getbranch(){return branch;}

public void setStudentName(String studentName){this.studentName=studentName;} 

public void setTrinerNeme(String trinerName){this.trinerName=trinerName;}

public void setCourse(String course){this.course=course;}

public void setCourseFees(int courseFees){this.courseFees=courseFees;}

public void setDuration(String duration){this.duration=duration;}

public void setBranch(String branch){this.branch=branch;}

}
class DTO_BesantInst{
public static void main(String []args){
Besant_Information stdInfo1=new Besant_Information();

stdInfo1.setStudentName("vijay");
stdInfo1.setTrinerNeme("Mei");
stdInfo1.setCourse("Java");
stdInfo1.setCourseFees(18000);
stdInfo1.setDuration("4 Month");
stdInfo1.setBranch("Velachery");

System.out.println("StudentName"+stdInfo1.getStudentName());
System.out.println("TrinerNeme"+stdInfo1.getTrinerName());
System.out.println(stdInfo1.getCourse());
System.out.println(stdInfo1.getCourseFees());
System.out.println(stdInfo1.getduration());
System.out.println(stdInfo1.getbranch());

}
}