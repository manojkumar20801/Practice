
package javaapplication31;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        int total=0,average = 0,count=0;
        
        System.out.print("Eneter the number of Students :");
        int size=s.nextInt();
        
        int mark[]=new int[size];
        for(int i=0;i<mark.length;i++)
        {
            System.out.print("Eneter the "+(i+1)+"st mark:");
            mark[i]=s.nextInt();
        }
        
        for(int i=0;i<mark.length;i++)
        {
            total+=mark[i];
            average=total/size;
        }
        
        System.out.println("Total="+total);
        System.out.println("Average="+average);
        System.out.println("Student marks above the Average=");
        
        for(int i=0;i<mark.length;i++)
        {
            if(mark[i]>=average)
            {
                count++;
                System.out.print(mark[i]+", ");
            }
        }
        System.out.println("Numbers of Students above the Average="+count);
    }
    
}
