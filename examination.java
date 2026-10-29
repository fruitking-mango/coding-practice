import java.util.Scanner;
import java.util.InputMismatchException;

class FailException extends Exception {
    FailException(String message) {
        super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student's marks: ");
            int marks = sc.nextInt();

            if (marks < 40) {
                throw new FailException("Student has failed the examination.");
            }

            System.out.println("Student has passed the examination.");

        } catch (FailException e) {
            System.out.println(e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Please enter numeric marks.");
        }

        sc.close();
    }
}
