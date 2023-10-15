
package createloans_g3;

/**
 *Loan is the Super Class (Parent Class)
 * An abstract class can have both abstract(unimplemented) & concrete methods (implemented)
 * An abstract class can have instance fields / variables
 * Abstract classes allow for code reusability by providing a common base that the subclass can extends from
 * A class can extend only one Abstract class 
 */
public abstract class Loan implements LoanConstant{
    
    int loanNum;
    String lastName;
    double amount;
    double rate;
    int term;
    
    public Loan(int num, String name, double amt, int yrs){
        loanNum = num;
        lastName = name;
        if(amt>MAXLOAN)
            amount = MAXLOAN;
        else
            amount = amt;
        
        if(yrs == SHORT_TERM || yrs==MEDIUM_TERM || yrs==LONG_TERM)
            term = yrs;
        else
            term =SHORT_TERM;
    }
    
    public String toString(){
            int r = (int)(rate * 100);
            return "Loan#" + loanNum + " Name: " + lastName + "R " + amount + " \n for " + term + " year (s) at " +
                    r + "% interest";
    }
    
    
}
