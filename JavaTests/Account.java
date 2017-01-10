import static java.lang.System.out;
import java.utill.Scanner;

public class Account {
  
  public static void main(String args[]) {
    Scanner username = new Scanner(System.in);
    
    /* This opens the scanner to recognise that the guest user is 
    *  about to log in
    */
    
    out.print("Username:");
    String username = keyboard.next();
  
    if(username.equals("Sebastian")) {
      out.print("Password:");
      String password = keyboard.next();
      
      /* If the Username typed in is equal to Sebastian, 
      *  it will ask for the password of Sebastian (Cheetah)
      */
      
    if(password.equals("Cheetah")) {
      out.print("Logged in");
    
    } else { 
      out.println(Unknown Username or Password, please verify");
  }
       keyboard.close():
 }
}
