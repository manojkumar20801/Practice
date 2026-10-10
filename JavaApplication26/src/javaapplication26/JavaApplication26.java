
package javaapplication26;

import java.util.Scanner;


public class JavaApplication26 {


    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        int target=9;
       
        int []nums=new int[4];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=s.nextInt();
        }
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    
                }
            }
        }
    }
    
}
