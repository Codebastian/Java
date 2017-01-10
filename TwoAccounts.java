import javax.swing.JOptionPane;

public class Authenticator {

  public static void main(String args[]) {
  
  String username =
    JOptionPane.showInputDialog("Username: "); {
  String password =
    JOptionPane.showInputDialog("Password: "); 
  
    if (
       username != null &&
       password != null &&
      (
        (username.equals("Sebastian") &&
         password.equals("Cheetah")) ||
        (username.equals("David") &&
         password.equald("Password"))
        
     /* The || is the divider between the two accounts, 
        it tells the program that they are seperate and Sebastian stays with Cheetah
     */
        
        )
      )
      
    { 
      JOptionPane.showMessageDialog
        (null, "You have logged into" + username + "'s Account")
        
    } else {
      JOptionPane.showMessaheDialog
        (null, "Incorrect Username or password");
    }
  }
}
