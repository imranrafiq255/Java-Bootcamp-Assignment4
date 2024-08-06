import java.util.Scanner;

public class Task3 {
    private static int countDigit(int number, int digit)
    {
        if (number<1)
        {
            return 0;
        }
        int findingNumber = number % 10; // get last digit
        number /= 10; // removd last digit
        if (findingNumber == digit)
        {
            return findingNumber;
        }
        return countDigit(number, digit);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        System.out.println("Enter digit");
        int digit = scanner.nextInt();
        if(countDigit(number,digit) == 0)
        {
            System.out.println("Number not found");
        }
        else {
            System.out.println("Number found: " + countDigit(number,digit));
        }
    }
}
