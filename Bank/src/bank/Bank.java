
package bank;


public class Bank
{
    static final String BankName="ABC Bank";
    static final double InterestRate=7.2;
    
    
    static double calculateinterest(double principal,int years)
    {
        double interest=(principal*InterestRate*years)/100;
        System.out.println(interest);
        return 0;
    }
    private String principal;
    private String years;
    private String interest;
    
    
    void display()
    {
        System.out.println("Bank Name: " + BankName);
        System.out.println("Principal Amount: " + principal);
        System.out.println("Years: " + years);
        System.out.println("Interest Amount: " + interest);
        
    }
}
