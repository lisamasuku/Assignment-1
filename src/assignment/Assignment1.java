
package assignment;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        User_details login = new User_details();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Register an account : ");
        
        System.out.print("Please Enter your Username >> ");
        String username = scanner.nextLine();
        
        System.out.print("Please Enter your password >> ");
        String password = scanner.nextLine();
        
        System.out.print("Please Enter your cellphone (e.g+27618184539) :");
        String cellphone = scanner.nextLine();
        
        if (login.isPasswordValid(password)){
            System.out.println("Password correctly formatted");
        } else {
            System.out.println("Passowrd incorrectly formatted ");
        }
        if(!login.isUsernameValid(username)) {
            System.out.println("Username correctly formatted");
        }else{
            System.out.println("Username incorrectly formatted");
        }
        if (login.isCellphoneVaild(cellphone)) {
            System.out.println("Cellphone correctly formatted");
        } else {
            System.out.println("Cellphone incorrectly formatted");
        }
          
 
        System.out.println("\nLogin :");
        
        
        System.out.println("Enter username:");
        String loginUsername = scanner.nextLine();
        
        System.out.println("Enter password:");
        String loginpassword = scanner.nextLine();
        
        System.out.println("Enter cellphone:");
        String logincellphone = scanner.nextLine();
        
        //Reference:AI META>[Accessed 10 April 2025];
        //Reference:Regex in java pg8<https://mystudies.iie.edu.za/d2l/le/lessons/22396/units/1880171>[Acessed 10 April 2025];
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        
        
        
                
    }
}

