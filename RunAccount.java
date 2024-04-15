// ST10226298
// Kyle Pillay


package za.ac.vc.kanban1;
import javax.swing.JOptionPane;

public class RunAccount 
{

    public static void main(String[] args) 
    {

        // Array of 5 user accounts (hard coded)
        Account[] accounts = new Account[10];
        accounts[0] = new Account("Kyl_1", "@Password123", "Kyle", "Correct");
        accounts[1] = new Account("J_Ohn", "@Password123", "John", "James");
        accounts[2] = new Account("Ca_itlyn", "@Password123", "Caitlyn", "Pillay");
        accounts[3] = new Account("Jame_s", "@Password123", "James", "Brown");
        accounts[4] = new Account("S_teven", "@Password123", "Steven", "Jones");

        int userCount = 10;

        while (true) 
        {
            // User prompt
            String[] options = {"Login", "Register", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Welcome to EasyKaban. Would you like to?",
                "EasyKaban", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            switch (choice) 
            {
                case 0: // Login
                    String username = JOptionPane.showInputDialog("Username:");
                    String password = JOptionPane.showInputDialog("Password:");

                    // Check if password and username match
                    boolean foundAccount = false;
                    for (Account account : accounts) 
                    {
                        if (account != null && account.getUsername().equals(username) &&
                                account.getPassword().equals(password)) 
                        {
                            foundAccount = true;
                            Login login = new Login();
                            String loginStatus = login.returnLoginStatus(username, password);
                            JOptionPane.showMessageDialog(null, loginStatus);
                            break;

                        }
                    }
                    if (!foundAccount) 
                    {
                        JOptionPane.showMessageDialog(null, "Username or password are incorrect, try again please.");
                    }
                    break;

                case 1: // Register
                    String firstName = JOptionPane.showInputDialog("First name:");
                    String lastName = JOptionPane.showInputDialog("Last name:");
                    String newUsername = JOptionPane.showInputDialog("New username:");
                    String newPassword = JOptionPane.showInputDialog("New password:");

                    // Creating new account
                    Login register = new Login();

                    boolean j = false;
                    j = register.checkUserName(newUsername);
                    if (j == true) 
                    {
                        JOptionPane.showMessageDialog(null, "Username successfully captured");
                        
                    } else 
                    {
                        JOptionPane.showConfirmDialog(null, "Username is not correctly formatted, please make sure that your username contains and underscore and is no more than 5 characters long");
                    }

                    String registerStatus = register.registerUser(firstName, lastName, newUsername, newPassword);
                    JOptionPane.showMessageDialog(null, registerStatus);
                    
                    if (register.equals(j)) 
                    {
                            accounts[userCount] = new Account(newUsername, newPassword, firstName, lastName);
                            userCount++;
                        } else
                    {
                            JOptionPane.showMessageDialog(null, "User Successfully registered");
                        }

                    break;

                case 2: // Exit
                    System.exit(0);
                    break;
            }
        }
    }
}
