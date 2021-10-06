

package bankmanagementsystem;

import java.io.*;
import java.util.*;
public class Bank {
    
    
    void DepositBalance(String username)
    {
        try{
             Scanner input = new Scanner(System.in);
             FileWriter writer = new FileWriter("C:\\Users\\User\\Documents\\NetBeansProjects\\BankManagementSystem\\src\\bankmanagementsystem\\"+username+".txt",true);
            
             System.out.println("Enter How Many TK You Want To Deposit  Your Account  ?");
             int tk = input.nextInt();
            
             String balance = String.valueOf(tk);
             writer.write(balance+"\n");
             writer.close();             
             System.out.println(balance);
             
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    void WidrowBalance(String username)
    {
        try{
            
        Scanner input = new Scanner(System.in);
        FileWriter writer = new FileWriter("C:\\Users\\User\\Documents\\NetBeansProjects\\BankManagementSystem\\src\\bankmanagementsystem\\"+username+".txt",true);
        System.out.println("Enter How Many Tk You Want To Widrow From Your Account ?");
        int tk = input.nextInt();
        String balance = String.valueOf(tk);
        writer.write("-"+balance+"\n");
        writer.close();   
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    void CheckBalance(String username)
    {
        try{
        File file = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\BankManagementSystem\\src\\bankmanagementsystem\\"+username+".txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;
        int totalbalance=0;
        int balance;
        while((str= br.readLine())!= null)
        {
           balance = Integer.parseInt(str);
           totalbalance = totalbalance + balance;                    
        }
        
        System.out.println("Total balance of username "+ username +" is "+ totalbalance+"\n");            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
     
}
