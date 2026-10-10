/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication25;

import java.util.Scanner;

/**
 *
 * @author Manoj
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
         Scanner s=new Scanner(System.in);
        
        int small=0;
        
        System.out.print("Eneter no. of Array:");
        byte size=s.nextByte();
        
        int arr[]=new int[size];
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Eneter the "+(i+1)+" Array:");
            arr[i]=s.nextInt();
        }
        
        
        
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
