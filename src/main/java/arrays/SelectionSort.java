package arrays;

public class SelectionSort {


    public static void main(String[] args) {

        int arr[] = {1, 2, 9, 3, 4, 8};

        selectionSort(arr);


    }


    public static void selectionSort(int arr[]) {


        for (int i = 0; i < arr.length - 1; i++) {


            int minposition = i;

            for (int j = i + 1; j < arr.length - 1; j++) {


                if (arr[minposition] > arr[j]) {

                    minposition = j;
                }


            }
            int temp = arr[minposition];

            arr[minposition] = arr[i];

            arr[i] = temp;


        }

        for (int x : arr) {

            System.out.print(x);
        }


    }
}
