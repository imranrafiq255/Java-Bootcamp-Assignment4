public class Task7 {
    private static String reverse(String s, int l, String newString)
    {
       if (l < 1)
       {
           return newString;
       }
       newString = newString.concat(String.valueOf(s.charAt(l-1)));
       return reverse(s,l-1, newString);
    }
    public static void main(String[] args) {
        String a = "abcdefgh";
        String newString = "";
        System.out.println(reverse(a, a.length(), newString));
    }
}
