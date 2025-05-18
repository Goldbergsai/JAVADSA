package arrays;

public class ReverseAnArrayWithOutUsingExtraSpace {

    public static void main(String[] args) {

        int arr[] = { 1,2,4, 5, 6, 7, 8};

         reverseAnArray(arr);
    }

    public  static void reverseAnArray(int[] arr){

        int first = 0; int last = arr.length-1;

        while(first < last){

            int temp = arr[last];

            arr[last] = arr[first];

            arr[first] = temp;

            first ++;
            last --;




        }

        for(int x : arr){

            System.out.print(x);
        }
    }
}
