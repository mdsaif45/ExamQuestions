import java.util.Scanner;


// Java Exceptions: Securing Message
class Encrypter{
     
    public static String getEncryptedName(String name){
        Validator v = new Validator();
        if(v.validate(name)){
            char c[] = name.toCharArray();
            String rev = "";
            for(int i=c.length-1;i>=0;i--){  
               rev+=c[i];  
           } 
           rev = rev.toLowerCase();
           return rev;
        }
        else{
            throw new IllegalArgumentException("Try again with valid name");
        }
    }
}
class Validator {
   public boolean validate(String name) {
       for (int i = 0; i < name.length(); i++) {
           char ch = name.charAt(i);
           
           if (ch != ' ' && !(Character.isLowerCase(ch) || Character.isUpperCase(ch))) {
               return false;
           }
       }
       
       return true;
   }
}

public class EncyptName {
   private static final Scanner INPUT_READER = new Scanner(System.in);
   
   public static void main(String[] args) {
       String name = INPUT_READER.nextLine();
       
       try {
           System.out.println(Encrypter.getEncryptedName(name));
       } catch (Exception e) {
           System.out.println(e);
       }
   }
}
