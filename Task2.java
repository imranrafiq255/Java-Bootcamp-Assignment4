import java.util.Scanner;

public class Task2 {
    private static String palindrome(String s, int l, String myStr)
    {
        if (l < 1)
        {
            return myStr;
        }
        myStr = myStr.concat(String.valueOf(s.charAt(l-1)));
        return palindrome(s,l-1,myStr);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check palindrome");
        String myString = scanner.next();
        System.out.println(palindrome(myString, myString.length(), ""));
        if (palindrome(myString, myString.length(), "").equals(myString))
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
