// ST10226298
// Kyle Pillay


package za.ac.vc.kanban1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RunLogin 
{
    
    public RunLogin() 
    {
        
    }
    
    @BeforeAll
    public static void setUpClass() 
    {
        
    }
    
    @AfterAll
    public static void tearDownClass() 
    {
        
    }
    
    @BeforeEach
    public void setUp() 
    {
        
    }
    
    @AfterEach
    public void tearDown() 
    {
        
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() 
    {
        System.out.println("checkUserName");
        String username = "kyle!!!!!!!";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() 
    {
        System.out.println("checkPasswordComplexity");
        String password = "password";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() 
    {
        System.out.println("loginUser");
        String username = "Kyl_1";
        String password = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginUser(username, password);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() 
    {
        System.out.println("returnLoginStatus");
        String username = "Kyle!!!!";
        String password = "@Password123";
        Login instance = new Login();
        String expResult = "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters long.";
        String result = instance.returnLoginStatus(username, password);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() 
    {
        System.out.println("registerUser");
        String firstName = "Steven";
        String lastName = "JOnes";
        String username = "S_teven";
        String password = "@password123";
        Login instance = new Login();
        String expResult = "Password is not correctly formatted, please make sure that your password contains at least 1 digit, 1 lowercase letter, 1 uppercase letter, 1 special character (@#$%^&+=), and is between 8-20 characters long.";
        String result = instance.registerUser(firstName, lastName, username, password);
        assertEquals(expResult, result);
       
    }
    
}
