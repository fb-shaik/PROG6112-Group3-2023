
package lambdexpression_g1;
import java.util.Scanner; 

public class LambdExpression_G1 {

    //This is a functional interface 
  interface CalculateByThree{
      //abstract method that will return a double data-type value
      //this abstract method also takes a parameter to be used in its function
  double multipleByThree(double number);
  }
  
  interface GreetUser{
  String wlecome_user(String name);
  }
    
    public static void main(String[] args) {
     //create scanner to used to prompt & capture user input for a value
     Scanner user_input = new Scanner(System.in);
        System.out.println("Insert a number to multiply by three: ");
        double user_number = user_input.nextDouble();
       
        //Lambda Expression can be referred to as an unnamed method / anonymous methods
        //Used to implement a method that has been defined within a functional interface
        //Syntax for Lambda Expression 
        //(parameter list) -> lambda body
        //Interface(CalculateByThree) 
        //variable to hold the lambda expression (multiply) 
        CalculateByThree multiply = (number) ->number * 3;
        double answer = multiply.multipleByThree(user_number);

        System.out.println(user_number + " multiplied by 3: " + answer);
        
        //BlockCode Lambda Expression
        
        GreetUser send_greeting = (name) -> {
            System.out.println("Good Morning! ");
            System.out.println("Welcome" + " " + name);
         return null;
        };
        System.out.println(send_greeting.wlecome_user("Jake"));
        
        
       
    }
    
}
