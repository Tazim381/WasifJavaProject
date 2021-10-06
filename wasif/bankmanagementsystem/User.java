

package bankmanagementsystem;

import java.util.*;
import java.io.*;
public class User {
    Scanner input = new Scanner(System.in);
     Bank bnk = new Bank();
    
    void CreateAccount()
    {
        
        try{           
            FileWriter writer = new FileWriter("C:\\Users\\User\\Documents\\NetBeansProjects\\BankManagementSystem\\src\\bankmanagementsystem\\User.txt",true);
            System.out.println("Enter User Name ");
            String username = input.next();
            writer.write("#"+username+"\n");
            String gar = input.nextLine();            
            System.out.println("Enter passward : ");
            String  passward = input.nextLine();
            writer.write(passward+"\n");
            writer.close();
          
            File myfile = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\BankManagementSystem\\src\\bankmanagementsystem\\"+username+".txt");
            myfile.createNewFile();
            FileWriter writer2 = new FileWriter("C:\\Users\\User\\Documents\\NetBeansProjects\\BankManagementSystem\\src\\bankmanagementsystem\\"+username+".txt",true);
            writer2.write("0\n");
            writer2.close();
             
            }catch(IOException e)
            {
                e.printStackTrace();
            }            
    }
    
    
    void SignIn()
    {
        try{
             File file = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\BankManagementSystem\\src\\bankmanagementsystem\\User.txt");
             BufferedReader br = new BufferedReader(new FileReader(file));
             String st,username ,password;
             System.out.println("Enter username : ");
                username = input.next();
                System.out.println("Enter password : ");
                password = input.next();
                int flag = 0;
            while ((st = br.readLine()) != null)
            {
                String str = st;
                if(str.charAt(0)=='#')
                {
                for(int i = 0 ;i<username.length() ;i++)
                {
                    if(username.charAt(i)!= str.charAt(i+1))
                        flag =-1;
                }
                if(flag == 0) flag =1;
                }
                else
                {
                    if(flag ==1)
                    {
                    if(st.compareTo(password)==0)
                        flag++;
                    if(flag == 2) break;
                    }
                        flag = 0;
                }
            }
            
             if(flag == 2)
             {                
                 System.out.println("****Congratulations !!! You successfully Logged in ***\n");
                 while(true)
                 {
                      
                     System.out.println("1. For Deposit Money \n2. For widrow Money\n3.Check Balance\n4. For exit");
                     System.out.println("Enter Your Option  : ");
                     int n= input.nextInt();
                     if(n==1)
                     {
                         bnk.DepositBalance(username);
                     }
                     if(n==2)
                     {
                        bnk.WidrowBalance(username);
                     }
                     if(n==3)
                     {
                         bnk.CheckBalance(username);
                     }
                     if(n==4)
                     {
                         break;
                     }
                     else
                     {
                         System.out.println("Please Enter  a Correct Option ");
                     }                             
               }
             }
            else System.out.println("Your username/password isn't correct");
            }catch(IOException e)
            {
                e.printStackTrace();
            }                     
    }
}
