public class Task5 {
    private static int gcd(int x, int y)
    {
        if (x == 0 || y == 0)
        {
            return 0;
        }
        if (x == y)
        {
            return x;
        }
        if (x > y)
            return gcd(x - y, y);
        return gcd(x, y - x);
    }
    public static void main(String[] args) {
        System.out.println("GCD is: " + gcd(100,21));
    }
}
