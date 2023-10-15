
package createloans_g3;

/*Child class of the Loan Class
 */
public class BusinessLoan extends Loan {
    //parameter constructor, set the interest rate to 1%+ current prime interest rate
    public BusinessLoan(int num, String name, double amt, int yrs, double prime) {
        super(num, name, amt, yrs);
        rate = prime + 0.01;
    }
    
}
