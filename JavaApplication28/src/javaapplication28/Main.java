
package javaapplication28;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        
         Scanner s=new Scanner(System.in);
        
        System.out.print("Enter the size of 1st array:");
        int s1=s.nextInt();
       
        
        int []ar1=new int[s1];
        //int []ar2=new int[s1];
        
        int temp=0;
        
        for(int i=0;i<ar1.length;i++)
        {
            System.out.print("Enter the "+(i+1)+" array :");
            ar1[i]=s.nextInt();
        }
        
        System.out.println("Before Swap");
        
        for(int i=0;i<ar1.length;i++)
        {
            System.out.print(ar1[i]+" ");
        }
        
        for(int i=0;i<ar1.length;i++)
        {
            temp=ar1[i];
            
            ar1[ar1.length-i-1]=temp;
        }
        
        System.out.println("After Swap");
        
        for(int i=0;i<ar1.length;i++)
        {
            System.out.print(ar1[i]+" ");
        }
        
    }
    
}
