
//Normal inner class

class College{

    static String principalName="Vadivelu";
    int fee=30000;
    boolean uniform=false;
    public static void main(String[] args) {
        College principal =new College();
        // College.Dept hod= principal. new Dept();
        // hod.conductFunction();
        // principal.meetingHODs();
    
        University uni = new University();
        uni.main();
    }

    public void meetingHODs(){
        Dept hod=new Dept();
        hod.conductFunction();
    }

    class Dept{
        boolean uniform = true;
        public void conductFunction(){
            System.out.println(principalName);
            System.out.println(fee);
            System.out.println(uniform);
            System.out.println(this.uniform);
            System.out.println(College.this.uniform);
            System.out.println("CS Dept Function");
        }
    }
}


//Accessing inner class form out side class:
class University{
    public void main(){
        College principal2=new College();
        // principal2.meetingHODs();
        College.Dept hod=principal2.new Dept();
        hod.conductFunction();
    }
}