package arrays;

public class PairsInAnArray {

    public static void main(String[] args) {

        int arrs [] = { 2,4,6,8,10 };

        pairsInAnArray(arrs);

    }


    public static void pairsInAnArray(int arr[]){

        for(int i=0; i< arr.length; i++){

            for(int j=i+1; j <arr.length; j++){

                System.out.println( arr[i] + " "+arr[j] );
            }
//            System.out.println( );
        }

    }


}
