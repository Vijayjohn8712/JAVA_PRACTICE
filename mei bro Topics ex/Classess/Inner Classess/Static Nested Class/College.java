

public class College {


        static String principalName="Vadivelu";
        int fee=30000;
        boolean uniform=false;
        public static void main(String[] args) {
            College.Dept hod=new College.Dept();
            hod.addmisstion();
          
        }
    
        static class Dept{
       public void addmisstion(){
        System.out.println("Admission succesfully");
       }
        } 
}
