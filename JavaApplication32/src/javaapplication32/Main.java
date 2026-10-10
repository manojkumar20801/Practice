
package javaapplication32;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        
         
        System.out.print("Eneter the number of Students :");
        int size=s.nextInt();
        
        int rnum[]=new int[size];
        
        for(int i=0;i<rnum.length;i++)
        {
            System.out.print("Eneter the "+(i+1)+"st RollNumber:");
            rnum[i]=s.nextInt();
        }
        
        System.out.print("Search the RollNumber:");
        int search=s.nextInt();
        
        for(int i=0;i<rnum.length;i++)
        {
            if(rnum[i]==search)
            {
                System.out.println("Roll Number "+search+" is found at position :"+i);
                break;
            }
            else
            {
                System.out.println("Roll Number "+search+" is not found");
            }
        }
            
    }
    
}
