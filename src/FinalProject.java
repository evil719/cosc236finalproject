import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class FinalProject {
     public static void main(String[] args) throws FileNotFoundException
     {
         viewIntro();
         JFrame frame = new JFrame();
         boolean logedIn = false;
         readPass(logedIn, frame);
         //quizTime(keyboard);
        
     }   
     
     private static void readPass(boolean logedIn, JFrame frame) throws
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
         
         int failedAttempts = 0;
         
         Object userName = JOptionPane.showInputDialog(frame, "Enter Username: ");
         Object passWord = JOptionPane.showInputDialog(frame, "Please Enter Pass"
                 + "word: ");
         
//         while(uFile.hasNext())
//         {
//             String userInfo = uFile.nextLine();
//             String[] userArray = userInfo.split("\t");
//             System.out.println("Please Enter your Username: ");
//             userName = keyboard.next();
//             System.out.println("Password: ");
//             passWord = keyboard.next();
//             
//             while(failedAttempts != 3)
//             {
//                for(int x = 0; x <= userArray.length; x++)
//                {
//                    if(!userName.equals(userArray[0]) && 
//                            !passWord.equals(userArray[1]))
//                    {
//                        logedIn = true;
//                        quizTime(keyboard);
//                    }      
//                    else
//                    {
//                       failedAttempts++; 
//                       System.out.println("Login Failed Try again!");
//                       readPass(keyboard, logedIn);
//                    }
//                }
//             }
//             
//         }
         
         
         
         
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
             int x = randNumb.nextInt(124) + 1;
             System.out.println(qList.get(x));
             String userAnswer = keyboard.next(); 
             
         }
         
         
         
     }

    private static void viewIntro() {
         JOptionPane.showMessageDialog(null, "Welcome to the Quiz App! Please have you're username and password ready!", "QuizTime",  JOptionPane.INFORMATION_MESSAGE);
    }
    
}
