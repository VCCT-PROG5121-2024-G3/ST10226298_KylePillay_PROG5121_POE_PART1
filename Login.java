// ST10226298
// Kyle Pillay
package za.ac.vc.kanban1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login 
{
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public boolean checkUserName(String username) 
    {
        boolean userStatus = false;
        if (username.length() <=5 && username.indexOf('_') != -1) 
        {
            userStatus = true;
        }
        return userStatus;
    }

    public boolean checkPasswordComplexity(String password) 
    {
        boolean passStatus = false;
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        if (m.matches()) 
        {
            passStatus = true;
        }
        return passStatus;
    }

    public boolean loginUser(String username, String password) 
    {
        boolean loginStatus = true;
        if (username.equals(this.username) && password.equals(this.password)) 
        {
            loginStatus = true;
        }
        return loginStatus;
    }

    public String returnLoginStatus(String username, String password) 
    {
        
        boolean loginStatus = false; 
        loginStatus = loginUser(username, password);
        String logStatus;
        if (loginStatus) 
        {
            logStatus = "Welcome " + firstName + " " + lastName + ". It's amaziong to see you.";
        } else 
        {
            logStatus = "Username or password incorrect, try again please.";
        }
        return logStatus;
    }

    public String registerUser(String firstName, String lastName, String username, String password) 
    {
        String mesgStatus = " ";
        if (checkUserName(username)) 
        {
            this.username = username;
            this.firstName = firstName;
            this.lastName = lastName;
            mesgStatus=("Username captured successfully");
        } else 
        {
            mesgStatus = "Username is not formatted correctly, please make sure that your username contains an underscore and is no more than 5 characters long.";
        }
        if (checkPasswordComplexity(password)) 
        {
            this.password = password;
            mesgStatus=("Password successfully captured");
        } else 
        {
            mesgStatus = "Password is not formatted correctly, please make sure that your password contains at least 1 digit, 1 lowercase letter, 1 uppercase letter, 1 special character (@#$%^&+=), and is between 8-20 characters long.";
        }
        return mesgStatus;
    }
}