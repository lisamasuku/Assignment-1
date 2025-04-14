
package assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_details {
    private String Username;
    private String password;
    private String cellphone;
    private String username;
    
    
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username) {
        this.Username = username;
    }
    
    public String getpassword(){
        return password;
    }
    public void setpassword(String password) {
        this.password = password;
    }
    public String getcellphone(){
        return cellphone;
    }
    public void setcellphone(String cellphone) {
        this.cellphone = cellphone;
    }
    
     
        
         
  
        // Method to validate the password
    public static boolean isPasswordValid(String password) {
        // Define the regex pattern for password validation
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,20}$";
        
        // Compile the pattern and match the password
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        
        // Return true if the password matches the pattern, false otherwise
        return matcher.matches();
    } 
    
    public boolean isUsernameValid(String Username){
     String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[_][A-Za-z_]{5})$";
     
     Pattern pat = Pattern.compile(regex);
     Matcher matcher = pat.matcher(Username);
     
     return matcher.matches();
    }
 public boolean isCellphoneVaild(String Cellphone) {
     String regex = "^\\+\\d{1,3}\\d{7,10}$";
     Pattern pat = Pattern.compile(regex);
     Matcher matcher = pat.matcher(Cellphone);
     
     return matcher.matches();
 }
        
        
    }
    
