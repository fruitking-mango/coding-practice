
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] seats = {100, 150, 80, 200, 120};

        try {
            System.out.print("Enter train index (0-4): ");
            int index = sc.nextInt();

            if (index < 0 || index > 4) {
                System.out.println("Invalid train index!");
            } else {
                System.out.println("Available seats: " + seats[index]);

                System.out.println("Enter thre number of tickets required");
                int tickets= sc.nextInt();
                if (tickets <=0){
                    System.out.println("Number of tickets must be positive");
                }
                else{
                    System.out.println("Enter the number of passenger groups : ");
                    int groups=sc.nextInt();
                
                if (seats[index] >= tickets) {
                        seats[index] -= tickets;
                        System.out.println("Booking successful!");
                        System.out.println("Remaining seats: " + seats[index]);
                    } else {
                        System.out.println("Insufficient seats available.");
                    }

                    if (groups == 0) {
                        System.out.println("Passenger groups cannot be zero!");
                    } else {
                        System.out.println("Average remaining seats per group: "
                                + (double) seats[index] / groups);
                    }
                }
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid train index!");

        } catch (java.util.InputMismatchException e) {
            System.out.println("Enter numeric values only!");

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred!");
        }

        sc.close();
    }
}
