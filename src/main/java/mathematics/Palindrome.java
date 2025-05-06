package mathematics;

public class Palindrome {

    public static void main(String[] args) {

        int x = 21;
        boolean isP = isPanlidrome(x);
        System.out.println(isP);

    }

    public static boolean isPanlidrome(int x) {
        int original = x;

        int reverse = 0;

        while (x > 0) {

            reverse = reverse * 10 + (x % 10);

            x = x / 10;


        }
        return reverse == original;

    }


}
