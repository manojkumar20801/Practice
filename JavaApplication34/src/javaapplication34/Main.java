
package javaapplication34;

import java.util.Scanner;


public class Main {


    public static void main(String[] args)
    {
       
        Scanner s=new Scanner(System.in);
        
       int Max=0,med=0;
        System.out.print("Eneter the Number of Products :");
        int num=s.nextInt();
        
        int price[]=new int[num];
        
        for(int i=0;i<price.length;i++)
        {
            System.out.print("Eneter the "+(i+1)+"st Poduct price:");
            price[i]=s.nextInt();
        }
        
        for(int i=0;i<price.length;i++)
        {
            if(Max<price[i])
            {
                Max=price[i];
            }
        }
        
           System.out.println("First Highet "+Max);
        for(int i=0;i<price.length;i++)
        {
            if((price[i]> med)&&(price[i]!=Max))
            {
               med =price[i];
            }
        }
        System.out.println("Second price:"+med);
    }
    
}
