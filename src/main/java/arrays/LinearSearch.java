package arrays;

public class LinearSearch {

    public static void main(String[] args) {

        int arr [] = { 23, 28, 3, 0, 89, 67, 1, 32} ;

        int largeNumber = findLargestNumberInAnArray(arr);
        System.out.println(largeNumber);

    }

    public static int findLargestNumberInAnArray(int arr[]){

        int largestNumber = Integer.MIN_VALUE;

        for(int i=0; i< arr.length; i++){

            if(arr[i] > largestNumber){

                largestNumber = arr[i];
            }


        }
        return largestNumber;

    }
}
