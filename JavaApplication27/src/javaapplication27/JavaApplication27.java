
package javaapplication27;

import java.util.Scanner;


public class JavaApplication27 {

   
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        System.out.print("Enter the size of 1st array:");
        int s1=s.nextInt();
        
        int []ar1=new int[s1];
        int []ar2=new int[s1];
        
        for(int i=0;i<ar1.length;i++)
        {
            System.out.print("Enter the "+(i+1)+" array 1:");
            ar1[i]=s.nextInt();
        }
        
        for(int i=0;i<ar1.length;i++)
        {
            System.out.print("Enter the "+(i+1)+" array 2:");
            ar2[i]=s.nextInt();
        }
        
        System.out.print("Common Element: 22");
        
        
        for(int i=0;i<ar1.length;i++)
        {
            for(int j=0;j<ar2.length;j++)
            {
                if(ar1[i]==ar2[j])
                {
                    System.out.print(ar1[i]+" ");
                }
            }
        }
        
        
    }
    
}