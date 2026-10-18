/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.registration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Student
 */
public class messageIT {
    
    public messageIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkMessageID method, of class message.
     */
    @Test
    public void testCheckMessageID() {
        System.out.println("checkMessageID");
        message instance = null;
        boolean expResult = true;
        
        
    }

    /**
     * Test of checkRecipientCell method, of class message.
     */
    @Test
    public void testCheckRecipientCell() {
        System.out.println("checkRecipientCell");
        message instance = null;
        String expResult = "+27718693002";
        
    }

    /**
     * Test of createMessageHash method, of class message.
     */
    @Test
    public void testCreateMessageHash() {
        System.out.println("createMessageHash");
        message instance = null;
        String expResult = "12:6:HITODAY";
        
    }

    /**
     * Test of sentMessage method, of class message.
     */
    @Test
    public void testSentMessage() {
        System.out.println("sentMessage");
        message instance = null;
        String expResult = "Send";
        
    }

    /**
     * Test of printMessages method, of class message.
     */
    @Test
    public void testPrintMessages() {
        System.out.println("printMessages");
        message instance = null;
        String expResult = "Hi Mike,can you join us for dinner tonight?";
       
    }

    /**
     * Test of returnTotalMessages method, of class message.
     */
    @Test
    public void testReturnTotalMessages() {
        System.out.println("returnTotalMessages");
        int expResult = 0;
       
    }

    /**
     * Test of storeMessage method, of class message.
     */
    @Test
    public void testStoreMessage() {
        System.out.println("storeMessage");
        message instance = null;
       
        
    }

    /**
     * Test of getMessageID method, of class message.
     */
    @Test
    public void testGetMessageID() {
        System.out.println("getMessageID");
        message instance = null;
        String expResult = "MSG12345";
        
    }

    /**
     * Test of getRecipient method, of class message.
     */
    @Test
    public void testGetRecipient() {
        System.out.println("getRecipient");
        message instance = null;
        String expResult = "085575975889";
        
    }

    /**
     * Test of getMessage method, of class message.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        message instance = null;
        String expResult = "Hi Keegan,did you receive the payment?";
       
    }

    /**
     * Test of getMessageHash method, of class message.
     */
    @Test
    public void testGetMessageHash() {
        System.out.println("getMessageHash");
        message instance = null;
        String expResult = "12:6:HITODAY";
        
    }
    
}
