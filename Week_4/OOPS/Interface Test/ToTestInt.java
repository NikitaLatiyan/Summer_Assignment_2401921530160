import java.util.Scanner;

public class ToTestInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Arithmetic obj = new Arithmetic();

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Square = " + obj.square(n));

        sc.close();
    }
}
