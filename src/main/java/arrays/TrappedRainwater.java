package arrays;

import com.sun.jdi.PathSearchingVirtualMachine;

public class TrappedRainwater {

    public static void main(String[] args) {

        int height [] ={4, 2, 0, 6, 3, 2, 5 };
        int water = getTrappedWater(height);

        System.out.println(water);


    }

    public static int getTrappedWater(int arrHeight[]){

        //formula to get trapped water

        // trappedWater = (waterlevel - heightOftheBar);

//        waterLevel = Minimum of (MaxofLefBuilding, Max of Right building);

        //toget max of left building

        int leftMax [] = new int[arrHeight.length];

        leftMax[0] = arrHeight[0];

        for(int i=1; i<arrHeight.length; i++){

            leftMax[i] = Math.max(arrHeight[i],leftMax[i-1]);

        }

        //to get right max of array
        int n = arrHeight.length;

        int rightMax[] = new int [arrHeight.length];
        rightMax[n-1]  = arrHeight[n-1];

        for(int i=n-2; i >= 0; i--){

            rightMax[i] = Math.max(arrHeight[i],rightMax[i+1]);

        }

        //to get Trapped Water

        int trapperWater = 0;

        for (int i=0;i<n;i++){

            int waterLevel = Math.min(rightMax[i],leftMax[i]);

            trapperWater = trapperWater + (waterLevel - arrHeight[i]);
        }


        return trapperWater;

    }



}
