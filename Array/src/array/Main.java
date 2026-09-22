
package array;


public class Main {

   
    public static void main(String[] args) throws InterruptedException
    {
        /*String name[]={"manoj","vijay","bharani","bala","thala"};

         for (int i = 0; i < name.length; i++)
         {
             System.out.println(name[i]);
             Thread.sleep(2000);

         }*/
        
        String word="Hi Welcome I am Manoj";
        
        String[] words = word.split(" ");

        for (int i = 0; i < words.length; i++) {

            System.out.println(words[i]);

            Thread.sleep(2000);
        }

    }
    
}
