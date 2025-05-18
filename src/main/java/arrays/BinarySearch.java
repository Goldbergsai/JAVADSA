package arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int arr [] = { 1,2,4,5,8,10,16,19,28,30,40,50};

        int number = 30 ;

        int indexOfNumber = findNumberUsingBinarySearch(arr,number);
        System.out.println(indexOfNumber);




    }

    public static int findNumberUsingBinarySearch(int arr[], int num) {
        int start =0; int end = arr.length-1;

        while(start <= end){

            int mid = (start + end )/2;
            if(arr[mid] == num){

                return mid;
            }

            if(arr[mid] < num){

                start = mid + 1;
            }else {

                end =mid - 1;
            }
        }

       return  -1 ;
    }


}
