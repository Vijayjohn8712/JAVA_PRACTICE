

class College{

    static String principalName="Vadivelu";
    int fee=30000;
    boolean uniform=false;
    public static void main(String[] args) {
        College principal =new College();
        principal.creatingDepts();
       
    }

//     //Accessing method local inner class from non-static method of outer class:
//   public void creatingDepts(){
//     String name = "ABCD";
//     System.out.println("Setting Teams for Dept");
//     class Dept{
//         public void inaugurate(){
//             System.out.println(fee);
//             System.out.println(principalName);
//             System.out.println("Dept start");
//         }
//     }
//     Dept hod=new Dept();
//     hod.inaugurate();
//   }

//   //Accessing method local inner class from static method of outer class:   
//   public static void creatingDepts(){
//     String name = "ABCD";
//     System.out.println("Setting Teams for Dept");
//     class Dept{
//         public void inaugurate(){
//             System.out.println(fee);
//             System.out.println(principalName);
//             System.out.println("Dept start");
//         }
//     }
//     Dept hod=new Dept();
//     hod.inaugurate();
//   }


public void creatingDepts(){
    int deptFee=100;
    String name = "ABCD";
    System.out.println("Setting Teams for Dept");
    class Dept extends Mobile{
        int fee=200;
        public void inaugurate(){
            System.out.println(fee);
            System.out.println(principalName);
            System.out.println("Dept start");
            fee=10;
            printHi();
            // deptFee=40; //Local variable deptFee defined in an enclosing scope must be final or effectively final
            System.out.println(deptFee);
        }
    }
    Dept hod=new Dept();
    hod.inaugurate();
  }
  }


  class Mobile{
    public void printHi(){
        System.out.println("Hai");
    }
  }