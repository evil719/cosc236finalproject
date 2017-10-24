import java.util.*;
import java.io.*;

public class FinalProject {
     public static void main(String[] args) throws FileNotFoundException
     {
         Scanner keyboard = new Scanner(System.in);
         File userFile = new File("UsersInfo_006.txt");
         Scanner uFile = new Scanner(userFile);
         randPass(uFile);
         quizTime(keyboard);
        
     }
     
     
     private static void randPass(Scanner uFile){ //Generate and Print Random Password to UsersInfo_006.txt
         
         
     }
     
     private static void quizTime(Scanner keyboard) throws FileNotFoundException{  //Quizes the User, This should be only allowed if password matches - TODO
          
         File questFile = new File("TestBank.txt"); //Retrive Question Bank
         while(!questFile.canRead())
         {
             System.out.println("TestBank.txt Not found, please make sure its in" 
                     + " the right directory.");
         }
         Scanner qFile = new Scanner(questFile); // Read Question Bank
         
         File answrFile = new File("Answers.txt"); // Answer Bank
         while(!answrFile.canRead())
         {
             System.out.println("Answers.txt Not found, please make sure its in"
                     + " the right directory.");
         }
         Scanner aFile = new Scanner(answrFile);
         
         String answr; // Get Answer from user
     
         for(int x = 1; x <= 10; x++) //VERY WIP Check on it.
        {
            System.out.println(qFile.nextLine());
            answr = keyboard.nextLine();
            answr = answr.toUpperCase();
            if(answr.equals("T") || answr.equals("t"))
                    answr = "TRUE";
            if(answr.equals("F") || answr.equals("f"))
                    answr = "FALSE";
            
            while(answr.equals("TRUE") || answr.equals("T") || 
                    answr.equals("FALSE") || answr.equals("F"))
            {                
                if(answr.equals("T") || answr.equals("t"))
                    answr = "TRUE";
                if(answr.equals("F") || answr.equals("f"))
                    answr = "FALSE";
                if(answr.equals("TRUE") || answr.equals("FALSE"))
                {                      
                    if(answr.equals(aFile.nextLine()))
                    {
                       System.out.println("Answer is correct!\n");                
                     }
                    else
                    {
                    System.out.println("Answer is wrong!\n");
                    }
                    System.out.println(qFile.nextLine());
                }
                else
                {
                   System.out.println("Please enter TRUE or FALSE."); 
                }
                
                answr = keyboard.nextLine();
                answr = answr.toUpperCase();
            }          
        }
         
     }
    
}
