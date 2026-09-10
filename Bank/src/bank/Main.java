
package bank;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       
        System.out.print("Enter principal amount: ");
        double pri=s.nextDouble();
        
        System.out.println("Enter number of years: ");
        int year=s.nextInt();
        
        Bank.calculateinterest(pri, year);
      
        
        
        Bank b=new Bank();
        b.display();
   
       
    }
    
}
