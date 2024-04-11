import java.util.*;

public class ArrayMethods {

    //Array Method returning min value in array
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

    //Array Method returning max value in array
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
    //Array Method returning number of times target is found in array
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
    //Array Method returning sum of array elements
    public static int intSum(int values[]){
        int sum = 0;
        //iterate through array && add value to sum
        for (int i = 0; i < values.length; i++){
            sum = sum + values[i];
        }
        return sum;
    }

    //Array Method returning true if array contains target
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
