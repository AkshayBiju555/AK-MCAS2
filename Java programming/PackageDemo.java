import calculator.Add;
import calculator.Mul;
import java.util.Scanner;

public class PackageDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        Add a = new Add();
        Mul m = new Mul();

        System.out.println("Sum = " + a.sum(num1, num2));
        System.out.println("Product = " + m.product(num1, num2));

        sc.close();
    }
}