// import the Scanner class
import java.util.Scanner;
public class App {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // // Method call
        // int product = multiply();
        // System.out.println("The product is: " + product);

        // // Method call
        // int quotient = divide();
        // System.out.println("The quotient is: " + quotient);
        
    
    //    String crush = revealmycrush();
    //    System.out.println(crush);

    myOrder();
      
        // Close scanner
        scan.close();
    }

    static int multiply() {
        System.out.println("Please enter two numbers to multiply");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x * y; 
    }

    // static int divide() {
    //     System.out.println("Please enter two numbers to divide");
    //     System.out.print("Enter first number: ");
    //     int x = scan.nextInt();

    //     System.out.print("Enter second number: ");
    //     int y = scan.nextInt();
    //     return x / y; 
    // }
    // static String revealmycrush(){
    //     System.out.println("This method will reveal your crush");
    //     System.out.print("Enter your name: ");
    //     String name = scan.nextLine(); 

    //     System.out.print("Enter the name of your crush: ");
    //     String crush = scan.nextLine(); 

    //     System.out.print("Enter name of your crush2:  ");
    //     String crush2 = scan.nextLine();
        
 
    //     return name + " Loves " + crush + " and " + crush2;

       
    

    static void myOrder() {
        System.out.println("Enter your first order");
        String myOrder1 = scan.nextLine();
        System.out.println("Enter the price");
        Double price1 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter your second order");
        String myOrder2 = scan.nextLine();
        System.out.println("Enter the price");
        Double price2 = scan.nextDouble();
        scan.nextLine();
       
        System.out.println("Enter the price of your oder");
        String myOrder3 = scan.nextLine();
        System.out.println("Enter the price");
        Double price3 = scan.nextDouble();
        scan.nextLine();

       Double total = price1 + price2 + price3;

       System.out.println("So the orders that youre gonna pick up are " + myOrder1 +  ", " + myOrder2 + ", " +  myOrder3);
       System.out.println("So your total amount is " + total);

    }
}

