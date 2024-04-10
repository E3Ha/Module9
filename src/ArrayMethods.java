import java.util.*;

public class ArrayMethods {

    public static int getMin(int values[]){
        int min = 0;

        min = values[0];
        //Linear Scan for minimum value
        for (int i = 0; i < values.length; i++){
            if (values[i] < min){
                min = values[i];
            }
        }
        return min;
    }

    public static int getMax(int values[]){
        int max = 0;

        max = values[0];
        //Linear Scan for maximum value
        for (int i = 0; i < values.length; i++){
            if (values[i] > max){
                max = values[i];
            }
        }
        return max;
    }

    public static int occurrenceScan(int values[], int target){
        int count = 0;
        //Loop for Array Length && add to count if target is found
        for (int i = 0; i < values.length; i++){
            if (values[i] == target){
                count += 1;
            }
        }
        return count;
    }

    public static int intSum(int values[]){
        int sum = 0;
        for (int i = 0; i < values.length; i++){
            sum = sum + values[i];
        }
        return sum;
    }

    //Having issues returning statements
    public static boolean contains(int values[], int target){
        int sentinel = -1;
        //Search for occurrence
        for (int i = 0; i < values.length; i++){
            //if target exists...
            if (values[i] == target){
                return true;

            }
        }
        return false;
    }


}
