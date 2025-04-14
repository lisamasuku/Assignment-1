/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package assignment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class User_detailsTest {
    
    public User_detailsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getUsername method, of class User_details.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        User_details instance = new User_details();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class User_details.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        User_details instance = new User_details();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getpassword method, of class User_details.
     */
    @Test
    public void testGetpassword() {
        System.out.println("getpassword");
        User_details instance = new User_details();
        String expResult = "";
        String result = instance.getpassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setpassword method, of class User_details.
     */
    @Test
    public void testSetpassword() {
        System.out.println("setpassword");
        String password = "";
        User_details instance = new User_details();
        instance.setpassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getcellphone method, of class User_details.
     */
    @Test
    public void testGetcellphone() {
        System.out.println("getcellphone");
        User_details instance = new User_details();
        String expResult = "";
        String result = instance.getcellphone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setcellphone method, of class User_details.
     */
    @Test
    public void testSetcellphone() {
        System.out.println("setcellphone");
        String cellphone = "";
        User_details instance = new User_details();
        instance.setcellphone(cellphone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPasswordValid method, of class User_details.
     */
    @Test
    public void testIsPasswordValid() {
        System.out.println("isPasswordValid");
        String password = "";
        boolean expResult = false;
        boolean result = User_details.isPasswordValid(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isUsernameValid method, of class User_details.
     */
    @Test
    public void testIsUsernameValid() {
        System.out.println("isUsernameValid");
        String Username = "";
        User_details instance = new User_details();
        boolean expResult = false;
        boolean result = instance.isUsernameValid(Username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
