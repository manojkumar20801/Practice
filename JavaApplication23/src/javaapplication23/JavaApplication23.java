
package javaapplication23;

import java.util.Scanner;

public class JavaApplication23 {

   
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        
        System.out.print("Eneter no. of Array:");
        byte size=s.nextByte();
        
        int arr[]=new int[size];
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Eneter the "+(i+1)+" Array:");
            arr[i]=s.nextInt();
        }
        
        int small=arr[1];
        
        for(int j=1;j<arr.length;j++)
        {
            if(arr[j]<small)
            {
                    small=arr[j];
            }
            
        }
        System.out.println("the smallest array is:"+small);
       
    }
    
}
