/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registration;
import java.util.Scanner;
/**
 * @author Student - Ditebogo
 * Registration POE Part 2 - commit 3
 * Added validation for user registration
 */
public class Registration {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String Username;
        String Firstname;
        String lastName;
        String Password;
        String cellphone;
        System.out.println("-------Registration-----------");
        System.out.print("Enter the Username:");
       String username = scanner.nextLine();
         
        System.out.print("Enter the first name: ");
        String firstname = scanner.nextLine();
        
        System.out.print("Enter the lastname: ");
        String lastname = scanner.nextLine();
        
        System.out.print("Enter the password: ");
        String password = scanner.nextLine();
        
        System.out.print("Enter the cellphone number: ");
        cellphone = scanner.nextLine();
    
        
        login login = new login();
        
        boolean validUsername = login.CheckUserName(username);
        boolean validPassword = login.checkPasswordComplexity(password);
        boolean validPhone = login.CheckCellPhoneNumber(cellphone);
        
        if(validUsername) {
            System.out.println("Username successfully captured"); }
        else {
            System.out.println("Username is not correctly formatted please ensure that your username contains an underscore and is notmore than fie characters in length");
        }
        
        if (validPassword) {
            System.out.println("Password is not correctly formatted please ensure password contains at least eight characters,a capital letter,a number,and a special character");
        }
        
        if(validPhone) {
        System.out.println("Phone number successfully captured");
    }
        else {
                System.out.println("Cell phone number incorrectly formatted or does not contain international code");
                }
        
        if(validUsername && validPassword && validPhone) {
            System.out.println("Registration successful");
            System.out.println("");            
            System.out.println("-------LOGIN-----------");
            System.out.print("Enter Username: ");
            
            String enteredUsername = scanner.nextLine();
            System.out.print("Enter Password: ");
            String enteredPassword = scanner.nextLine();
            
            boolean loginStatus = login.loginUser(username,password, enteredUsername, enteredPassword);
            
         if(loginStatus){
                
            System.out.println("Welcome to QuickChat");
            System.out.println("option 1) Send Messages");
            System.out.println("option 2) Recently send messages - Coming Soon");
            System.out.println("option 3) Quit");
                
                int controllerv =Integer.parseInt(scanner.nextLine());
                
            switch (controllerv){
                    
                case 1:
                        
                    System.out.println("How many messages would you like to send?");
                        
                     int total = Integer.parseInt(scanner.nextLine());
                       
        for (int i = 1; i <= total; i++) {
            System.out.println("");
            System.out.println("==========Message"+ i+"==========");
            System.out.println("Enter recipient number: ");
            String recipient =scanner.nextLine();
            System.out.print("Enter message: ");
                   String messageText =scanner.nextLine();
                            
         if (messageText.length() >250) {
            System.out.println("Please enter a message of less than 250 characters.");
                  i--;
                     continue;
                                
              }
           message msg = new message(i,recipient,messageText);
                            
        if (msg.checkMessageID()) {
            System.out.println("Message ID successfully created.");
                                
              }
            System.out.println(msg.checkRecipientCell());
            System.out.println("Message Hash" + msg.createMessageHash());
            System.out.println(msg.sentMessage());
            System.out.println(msg.printMessages());
            
               }
            System.out.println("total messages sent: " + message.returnTotalMessages());
                        break;
                        
                    case 2:
                       System.out.println("Coming Soon");
                        break;
                        
                    case 3:
                        System.out.println("Goodbye");
                        System.exit(0);
                        break;
                        
                    default :
                        System.out.println("Invalid  option");
                        break;
                }
            }       else {
                System.out.println("Login failed");
            }
        }else {
            System.out.println("Registration UnSuccessfull");
            
            
                        scanner.close();
        }
    }
}
    
            
        
  

            
            
            
            
                   
     
    
                  
                    
            
        
        
        
        
        
        
        
        
        
        
        
        
        
                            
            
       
      
                
    

