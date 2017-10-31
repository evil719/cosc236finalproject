import java.util.*;
import java.io.*;

public class FinalProject {
     public static void main(String[] args) throws FileNotFoundException
     {
         Scanner keyboard = new Scanner(System.in);
         boolean logedIn = false;
         
         
         readPass(keyboard, logedIn);
         //quizTime(keyboard);
        
     }
     
     
     private static void readPass(Scanner keyboard, boolean logedIn) throws
             FileNotFoundException{ 
//Check For Userpassword
         File userFile = new File("UsersInfo_006.txt");
         
         while(!userFile.canRead())
         {
             System.out.println("UserInfo can Not found, please make sure its in" 
                     + " the right directory.");
             break;
         }
         Scanner uFile = new Scanner(userFile);
         String userName, passWord;
         int failedAttempts = 0;
         
         while(uFile.hasNext())
         {
             String userInfo = uFile.nextLine();
             String[] userArray = userInfo.split("\t");
             System.out.println("Please Enter your Username: ");
             userName = keyboard.next();
             System.out.println("Password: ");
             passWord = keyboard.next();
             
             while(failedAttempts != 3)
             {
                for(int x = 0; x <= userArray.length; x++)
                {
                    if(!userName.equals(userArray[0]) && 
                            !passWord.equals(userArray[1]))
                    {
                        logedIn = true;
                        quizTime(keyboard);
                    }      
                    else
                    {
                       failedAttempts++; 
                       System.out.println("Login Failed Try again!");
                       readPass(keyboard, logedIn);
                    }
                }
             }
             
         }
         
         
         
         
     }
     
     private static void quizTime(Scanner keyboard) 
             throws FileNotFoundException{  
//Quizes the User, This should be only allowed if password matches - TODO
          
         File questFile = new File("TestBank.txt"); //Retrive Question Bank
         while(!questFile.canRead())
         {
             System.out.println("TestBank.txt Not found, please make sure its in" 
                     + " the right directory.");
         }
         Scanner qFile = new Scanner(questFile); // Read Question Bank
         
         ArrayList<String> qList = new ArrayList<>(); //Puts Question Bank into Array List
         while(qFile.hasNext())
         {
             qList.add(qFile.nextLine());
         }       

         File answrFile = new File("Answers.txt"); // Answer Bank
         while(!answrFile.canRead())
         {
             System.out.println("Answers.txt Not found, please make sure its in"
                     + " the right directory.");
         }
         Scanner aFile = new Scanner(answrFile);
         ArrayList<String> aList = new ArrayList<>(); //Throws answer bank into ArrayList
         while(aFile.hasNext())
         {
             aList.add(aFile.nextLine());
         }
         
         System.out.println("How many questions would you like?");
         int numbQs = keyboard.nextInt();
         Random randNumb = new Random();
         
         for(int i = 0; i <= numbQs;i++)
         {
             
         }
         
         
         
     }
    
}
