
package javaapplication21;

import java.util.Scanner;


public class JavaApplication21
{

   
    public static void main(String[] args) 
    {
        
        Scanner s=new Scanner(System.in);
        
        int Total=0;
        int Avg=0;
        
        System.out.println("Eneter no. of subjects");
        byte size=s.nextByte();
        
        int marks[]=new int[size];
        
        for(int i=0;i<marks.length;i++)
        {
            System.out.print("Eneter the mark"+(i+1)+":");
            marks[i]=s.nextInt();
        }
        
        for(int j=0;j<marks.length;j++)
        {
            Total+=marks[j];
        }
        
        System.out.println("Total="+Total);
        Avg=Total/marks.length;
        
        System.out.println("Average="+Avg);
        
            
        
       
    }
    
}
