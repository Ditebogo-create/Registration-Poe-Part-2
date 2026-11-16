/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.registration;

import java.util.Scanner;
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
public class MessageDebuggingExerciseIT {
    
    public MessageDebuggingExerciseIT() {
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
     * Test of checkMessageID method, of class MessageDebuggingExercise.
     */
    @Test
    public void testCheckMessageID() {
        System.out.println("checkMessageID");
        String messageId = "0838884567";
        boolean expResult = true;
        boolean result = MessageDebuggingExercise.checkMessageID(messageId);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkRecipientCell method, of class MessageDebuggingExercise.
     */
    @Test
    public void testCheckRecipientCell() {
        System.out.println("checkRecipientCell");
        String cellNumber = "+27838968976";
        String expResult = "Cell phone number [is incorrectly formatted.Please try again]";
        String result = MessageDebuggingExercise.checkRecipientCell(cellNumber);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkMessageLength method, of class MessageDebuggingExercise.
     */
    @Test
    public void testCheckMessageLength() {
        System.out.println("checkMessageLength");
        String messageText = "Did you get the cake?";
        String expResult = "Message ready to send.";
        String result = MessageDebuggingExercise.checkMessageLength(messageText);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of createMessageHash method, of class MessageDebuggingExercise.
     */
    @Test
    public void testCreateMessageHash() {
        System.out.println("createMessageHash");
        String messageId = "1234567890";
        int currentMsgNum = 0;
        String messageText = "Hello world";
        String expResult = "12:0:HELLOWORLD";
        String result = MessageDebuggingExercise.createMessageHash(messageId, currentMsgNum, messageText);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of sendOrStoreMessage method, of class MessageDebuggingExercise.
     */
    @Test
    public void testSendOrStoreMessage() {
        System.out.println("sendOrStoreMessage");
        Scanner input = new Scanner("1\n");
        String messageId = "1234567890";
        String recipient = "+27838884567";
        String messageText = "Did you get the cake?";
        String expResult = "Message successfullysent.";
        String result = MessageDebuggingExercise.sendOrStoreMessage(input, messageId, recipient, messageText);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getLongestStoredMessageText method, of class MessageDebuggingExercise.
     */
    @Test
    public void testGetLongestStoredMessageText() {
        System.out.println("getLongestStoredMessageText");
        String expResult = "Where are you?You are late!I have asked you to be on time.";
        String result = MessageDebuggingExercise.getLongestStoredMessageText();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of saveMessage method, of class MessageDebuggingExercise.
     */
    @Test
    public void testSaveMessage() {
        System.out.println("saveMessage");
        String messageId = "02";
        String hash = "02:2:WHERETIME.";
        String recipient = "+27838884567";
        String messageText = "Where are you?You are late! I have asked you to be on time.";
        MessageDebuggingExercise.saveMessage(messageId, hash, recipient, messageText);
        
    }
    
}
