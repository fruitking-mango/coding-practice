
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 10;
            int[] marks = {10, 20, 30, 40, 50};

            System.out.println(marks[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred");
        }
        catch (InputMismatchException e) {
            System.out.println("InputMismatchException occurred");
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred");
        }
        catch (Exception e) {
            System.out.println("Exception occurred");
        }
        finally {
            System.out.println("Doesn't matter if there is an exception or not. This code will run!!");
        }

        System.out.println("Rest of the code");
    }
}
