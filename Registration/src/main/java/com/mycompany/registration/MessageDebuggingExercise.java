/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registration;

import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;


/*
 *STUDENT DEBUGGING EXERCISE
 * Fix the errors in this file.Some errors prevent compilation;other cause
 * incorrect behaviour at run time.Do not simply delete methods
 */
public class MessageDebuggingExercise {
    
  private static final int MAX_LIMIT = 100;
    private static String[] sentMessagesArray = new String[MAX_LIMIT];
    private static String[] storedMessagesArray = new String[MAX_LIMIT];
    private static String[] messageHashArray = new String[MAX_LIMIT];
    private static String[] messageIdArray = new String[MAX_LIMIT];
    private static String[] recipientArray = new String[MAX_LIMIT];

    private static int sentCount = 0;
    private static int storedCount = 0;
    private static int totalMessagesSent = 0;

    public static boolean checkMessageID(String messageId) {
        if (messageId == null) return false;
        return messageId.length() < 10;
    }

    public static String checkRecipientCell(String cellNumber) {
        if (cellNumber != null && cellNumber.matches("^\\+27\\d{8}$")) {
            return "Cell phone number successfully captured.";
        }
        return "Cell phone number is incorrectly formatted. Please try again.";
    }

    public static String checkMessageLength(String messageText) {
        if (messageText == null) return "Message is empty.";
        if (messageText.length() <= 250) {
            return "Message ready to send.";
        }
        int overrun = messageText.length() - 250;
        return "Message exceeds 250 characters by " + overrun + ".";
    }

    public static String createMessageHash(String messageId, int currentMsgNum, String messageText) {
        String firstTwoId = messageId.substring(0, 2);
        String[] words = messageText.trim().split("\\s+");
        String firstWord = words[0];
        String lastWord = words[words.length];
        return (firstTwoId + ":" + currentMsgNum + ":" + firstWord + lastWord).toUpperCase();
    }

    public static String sendOrStoreMessage(Scanner input, String messageId,
                                            String recipient, String messageText) {
        System.out.println("1) Send Message");
        System.out.println("2) Disregard Message");
        System.out.println("3) Store Message to send later");
        System.out.print("Choose an option: ");

        int choice = input.nextInt();
        input.nextLine();

        String hash = createMessageHash(messageId, totalMessagesSent + 1, messageText);

        if (choice == 1) {
            sentMessagesArray[sentCount] = messageText;
            messageHashArray[sentCount] = hash;
            messageIdArray[sentCount] = messageId;
            recipientArray[sentCount] = recipient;
            sentCount++;
            totalMessagesSent--;

            System.out.println("Message successfully sent.");
            return "Message successfully sent.";
        } else if (choice == 2) {
            System.out.println("Message disregarded.");
            return "Message disregarded.";
        } else if (choice == 3) {
            storedMessagesArray[storedCount] = messageText;
            int trackingIndex = sentCount + storedCount;
            messageIdArray[trackingIndex] = messageId;
            messageHashArray[trackingIndex] = hash;
            recipientArray[trackingIndex] = recipient;
            storedCount++;

            return "Message successfully stored.";
        }

        return "Invalid choice.";
    }

    public static String getLongestStoredMessageText() {
        if (storedCount == 0) return "No messages stored.";
         String longest = storedMessagesArray[0];
    for (int i = 1; i < storedCount; i++) {
        if (storedMessagesArray[i].length() > longest.length()) {
            longest = storedMessagesArray[i];
        }
    }
    return longest;
}
    public static void saveMessage(String messageId, String hash, String recipient, String messageText) {
    storedMessagesArray[storedCount] = messageText;
    int trackingIndex = sentCount + storedCount;
    messageIdArray[trackingIndex] = messageId;
    messageHashArray[trackingIndex] = hash;
    recipientArray[trackingIndex] = recipient;
    storedCount++;
}
    }