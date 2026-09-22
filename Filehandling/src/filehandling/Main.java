
package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Main {


    public static void main(String[] args) throws IOException {
        
        File f=new File("D:\\File");
        f.mkdir();
        
        File f1=new File("D:\\File\\new.txt");
        f1.createNewFile();
        
        FileWriter f3=new FileWriter("D:\\File\\new.tx");
        f3.write("hi hello  Thank you");
        f3.close();
        
        
        file f4=new File("F:\\movie\\CARTOON");
        
  
        
    }
    
}
