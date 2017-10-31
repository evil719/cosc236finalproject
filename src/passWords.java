import java.util.*;
import java.io.*;


public class passWords  {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File userFile = new File("UsersInfo_006.txt");
        Scanner uFile = new Scanner(userFile);
        while(uFile.hasNext())
                {
                    String userInfo = uFile.nextLine();
                    String[] userArray = userInfo.split("\t");
                    
                    
                    
                    Random rnd = new Random();
        String randPass = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder passWord = new StringBuilder();
        
        userArray = new String[6];
        userArray[2] = userArray[1];
        userArray[3] = userArray[2];
        userArray[4] = userArray[3];
        userArray[5] = userArray[4];
        
        
//        for(int i = 0; i < userArray.length;i++)
//        {
//            while(passWord.length() == 6)
//            {
//                int index = (int) (rnd.nextFloat() * randPass.length());
//                passWord.append(randPass.charAt(index));
//            }
//            String pWord =  passWord.toString();
//            userArray[1] = pWord;
//        }
//        FileWriter fw = new FileWriter(userFile);
//        for (String userArray1 : userArray) {
//            fw.write(userArray1 + "\n");
//        }
//        fw.close();
        
                    
                   
                }  
        
        
      uFile.close();  
    }
    
    
    
    
    
    
}
