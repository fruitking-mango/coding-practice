import java.util.Scanner;
import java.util.InputMismatchException;

class OutOfStockException extends Exception {
    OutOfStockException(String message) {
        super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        try {
            System.out.print("Enter the quantity available stock : ");
            int stock=sc.nextInt();
            System.out.print("Enter the quantity of the stock required : ");
            int request = sc.nextInt();
            if (stock < request) {
                 throw new OutOfStockException("Insufficient stock available");
             }

            System.out.println("Stock granted succesfully");
            } 
            catch (OutOfStockException e) {
             System.out.println(e.getMessage());

         } catch (InputMismatchException e) {
             System.out.println("Please enter numeric stock.");
         }

         sc.close();
     }
 }

