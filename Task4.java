public class Task4 {
    private static int handshake(int number)
    {
        if (number <= 1)
        {
            return 0;
        }
        return (number-1) + handshake(number-1);
    }
    public static void main(String[] args) {
        System.out.println("Total handshakes are: " + handshake(2));
    }
}
