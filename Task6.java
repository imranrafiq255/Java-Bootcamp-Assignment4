public class Task6 {
    private static int power(int base, int exponential, int temp)
    {
        if (exponential == 0 || exponential == 1)
        {
            return base;
        }
        base *= temp;
        return power(base,exponential-1,temp);
    }
    public static void main(String[] args) {
        System.out.println(power(3,3,3)); // here temp is also equal to base
    }
}
