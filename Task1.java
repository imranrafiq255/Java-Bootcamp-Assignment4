import java.util.Scanner;

public class Task1 {
    private static long factorial(long num)
    {
        if (num == 0 || num < 0)
        {
            return 1;
        }
        return num * factorial(num-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        long number = scanner.nextLong();
        System.out.println("The factorial of " + number + " is " + (factorial(number)));
    }
}
