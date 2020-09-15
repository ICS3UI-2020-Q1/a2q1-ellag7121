import java.util.Scanner;
/**
 * get a number from the user, tell the user if the number is odd or even
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // import a scanner for user input
    Scanner input = new Scanner(System.in);

    //initialize variables
    int integer; //the integer that is provided by the user
    int remainder; //the remainder of the integer when divided by 2

    //initialize constants
    final int EVEN = 0; //the remainder for an even number divided by 2

    //prompt user input
    System.out.println("Please enter an integer:"); //ask user for input
    integer = input.nextInt(); //store the integer in the ineger variable

    //get the remainder of the integer divided by 2
    remainder = integer%2;

    //check if the remainder is even
    if (remainder == EVEN){
      //tell the user that their number is even
      System.out.println(integer + " is an even number");
    }else{ //do this if the remainder is odd
      //tell the user that their number is odd
      System.out.println(integer + " is an odd number");
    }
  }
}
