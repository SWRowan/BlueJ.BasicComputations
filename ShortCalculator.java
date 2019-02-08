
import java.util.Scanner;


public class ShortCalculator {
  
  
    
    public static short getSum(short shortIn, short shortIn2) {
     return (short)(shortIn + shortIn2);
    }
     
    public static short getDif(short shortIn, short shortIn2) {
     return (short)(shortIn - shortIn2);
    }
     
    public static short getPro(short shortIn, short shortIn2) {
     return (short)(shortIn * shortIn2);
    }
     
    public static short getQuo(short shortIn, short shortIn2) {
     return (short)(shortIn / shortIn2);
    }
     
    public static short getMod(short shortIn, short shortIn2) {
     return (short)(shortIn % shortIn2);
    }
     
    
  public static void main(String[] args){
    int userInput ;
    int userInput2 ;
    Scanner input = new Scanner(System.in);
    Scanner text = new Scanner(System.in);
    boolean cont = true;
     
     
     System.out.println("Enter first number between 0 - 65,535: ");
     userInput = input.nextInt();
     short shortIn = (short)userInput;
     
     System.out.println("Enter second number between 0 - 65,535: ");
     userInput2 = input.nextInt();
     short shortIn2 = (short)userInput2;
     
    
     
    System.out.println("The sum is: " + getSum(shortIn, shortIn2));
    System.out.println("The difference is: " + getDif(shortIn, shortIn2));
    System.out.println("The product is: " + getPro(shortIn, shortIn2));
    System.out.println("The quotient is: " + getQuo(shortIn, shortIn2));
    System.out.println("The remainder is: " + getMod(shortIn, shortIn2));
    
    //System.out.println("Do you want to try more numbers? Type 'Yes' or 'No'");
    //String response = input.nextLine();
    //if (response == "No") {
        //cont = false;
    //}
    
   
           
   }
   
    
    
    
}
