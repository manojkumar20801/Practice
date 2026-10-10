
package javaapplication33;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        int count=0; 
        System.out.print("Eneter the Number of Family members :");
        int size=s.nextInt();
        
        int age[]=new int[size];
        
        for(int i=0;i<age.length;i++)
        {
            System.out.print("Eneter the "+(i+1)+"st Member Age:");
            age[i]=s.nextInt();
        }
        
        System.out.print("Reverse order");
        for(int i=age.length-1;i>=0;i--)
        {
            System.out.print(age[i]+",");
        }
        
        System.out.print("\n"+"Members above 18=");
        for(int i=0;i<age.length;i++)
        {
            if(age[i]>=18)
            {
                System.out.print(age[i]+",");
                count++;
            }
        }
        System.out.println("count of 18 or above 18+ "+count);
        
    }
    
}

