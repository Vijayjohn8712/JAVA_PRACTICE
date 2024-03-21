class   YTuserDefEx{
static public void main(String []args){
    PasswordException pe=new PasswordException();
    try{
   pe.verifyPassword("vijay");
//    throw new  PasswordException();
    }catch(PasswordException pex){
    //   System.out.println(pex.getMessage());
      pex.printStackTrace();
        System.out.println("Exception accure:\"Password Too Short\"");
    }
}
}

class PasswordException extends Exception{
    public void verifyPassword(String pwd)throws PasswordException{
        if(pwd.length()<8){
            PasswordException pe=new PasswordException();
            throw pe;
            // System.out.println("Exception accure");
        }
        //else{  give not else key ,cause if condition run that condition throw the exception and stop the program.
            System.out.println("Strong Password");
    
    }
}

