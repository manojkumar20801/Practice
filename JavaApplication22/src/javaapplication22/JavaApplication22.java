
package javaapplication22;

import java.util.Scanner;

public class JavaApplication22 {

 
    public static void main(String[] args) {
     
         
        Scanner s=new Scanner(System.in);                    
        
        int poscount=0;
        int negcount=0;
        
        System.out.print("Eneter no. of Array:");
        byte size=s.nextByte();
        
        int arr[]=new int[size];
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Eneter the "+(i+1)+" Array:");
            arr[i]=s.nextInt();
        }
        
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]>=0)
            {
                poscount++;
                
            }
        }
        
        
         for(int j=0;j<arr.length;j++)
        {
            if(arr[j]<0)
            {
                negcount++;
                
            }
        }
         System.out.println("Positive count="+ poscount);
         System.out.println("Negative count="+ negcount);
    }   
    
}
