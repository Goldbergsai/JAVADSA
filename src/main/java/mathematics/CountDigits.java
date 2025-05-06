package mathematics;

public class CountDigits {

    public static void main(String args[]) {

        int x = 125;
        int count = countDigits(x);
        System.out.println(count);

    }

    public static int countDigits(int x) {

        int count = 0;

        while (x > 0) {

            x = x / 10;
            count++;
        }
        return count;
    }
}
