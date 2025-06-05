package arrays;

public class BubbleSort {


    public static void main(String[] args) {

        int arr[] = {1,2,9,3,4,8};
        bubbleSort(arr);




    }

    public static void bubbleSort(int[] arr) {

        for (int turn = 0; turn < arr.length - 1; turn++) {

            int swaps = 0;



            for (int j = 0; j < arr.length - 1 - turn; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;
                    swaps++;
                }

            }
            if (swaps == 0) {

                break;
            }


        }
        for (int x : arr) {
            System.out.print(x);
        }


    }
}
