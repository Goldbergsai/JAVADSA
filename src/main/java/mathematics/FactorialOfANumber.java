package mathematics;

public class FactorialOfANumber {


    public static void main(String[] args) {

        int number = 6;

        int factorial = rfact(number);

        System.out.println(factorial);

    }

    public static int factorialofn(int n) {
        int result = 1;

        for (int i = n; i > 0; i--) {

            result = result * i;


        }

        return result;
    }

    //recursive function
    public static int rfact(int n){

        if(n == 0){
            return 1;
        }

        return  n * rfact(n-1);

    }

}
