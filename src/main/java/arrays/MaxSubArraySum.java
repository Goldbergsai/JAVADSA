package arrays;

public class MaxSubArraySum {

    public static void main(String[] args) {
        int arr [] = { 1,-2, 6,-1, 3};
        maxSubArraysSum(arr);
    }

    public static void maxSubArraysSum(int arr[]){

        int maxnumber = 0;


        for(int i=0; i< arr.length ;i++){

            for(int j=i+1; j< arr.length ;j++){

                int sum=0;
                for(int k=i; k<=j; k++){

                     sum = sum + arr[k];

                    System.out.print(arr[k]);
                }
                if(sum > maxnumber){
                    maxnumber = sum;
                }

                System.out.println();
            }

        }

        System.out.println("Max sumnumber " +maxnumber);
    }
}
