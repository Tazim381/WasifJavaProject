
package bankmanagementsystem;

import java.util.*;
import java.io.*;
public class BankManagementSystem {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bnk = new Bank();
        User usr = new User();
        
        while(true)
        {
        System.out.println("1.For Create Account \n2.For signIn \n3. For Exit");
        System.out.println("Enter your Option ");
        int n = input.nextInt();
      
        if(n==1)
        {
            usr.CreateAccount();
        }
        
        else if(n==2)
        {
            usr.SignIn();
        }
        else
        {
            break;
        }
                
    }
    
}
}