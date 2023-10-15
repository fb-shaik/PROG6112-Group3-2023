
package createloans_g3;

    /**
     * Application will create an array of 5 loans
     * Prompt the user for the current prime interest rate
     * Loop & prompt the user for loan details; store in the Loan objects array 
     * Display captured details
     */
import javax.swing.*;
public class CreateLoans_G3 implements LoanConstant {
    public static void main(String[] args) {
        final int MAX = 5;
        Loan[] loan = new Loan[MAX];
        int num;
        String name;
        double amt, rate;
        int loanType;
        int term;
         int x;
         String inStr, outString = COMPANY + "\n";
         
         inStr = JOptionPane.showInputDialog(null, "Welcome to " + COMPANY + "\n Enter the prime interest rate in decimal format: ");
         rate = Double.parseDouble(inStr);
         
         for(x=0; x<MAX; ++x){
                inStr = JOptionPane.showInputDialog(null, "Is this a Business Loan (1) " + "\nOr Personal Loan (2)");
                loanType = Integer.parseInt(inStr);
                inStr = JOptionPane.showInputDialog(null, "Enter Account number: ");
                num =Integer.parseInt(inStr);
                name = JOptionPane.showInputDialog(null, "Enter Last Name: ");
                inStr = JOptionPane.showInputDialog(null, "Enter Loan Amount: ");
                amt = Double.parseDouble(inStr);
                inStr = JOptionPane.showInputDialog(null, "Enter Term Duration: ");
                term = Integer.parseInt(inStr);
                
                if(loanType==1){
                    BusinessLoan temp = new BusinessLoan(num,name,amt, term, rate);
                    loan[x] = temp;
                } else
                {
                    PersonalLoan temp = new PersonalLoan(num, name, amt, term, rate);
                    loan[x] = temp;
                }
         }
         
         for(x=0; x<MAX; ++x){
         outString += loan[x].toString() + "\n";
         JOptionPane.showMessageDialog(null, outString);
         } 
      
        
    }
    
}
