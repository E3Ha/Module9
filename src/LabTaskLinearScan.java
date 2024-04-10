import java.util.*;

public class LabTaskLinearScan {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        //1a - declare array with length 100
        int [] dataPoints = new int [100];
        int sum = 0;
        double average = 0;
        int count = 0;
        int userSearch = 0;
        int locus = -1;
        int min = 0;
        int minlocus = 0;
        int max = 0;
        int maxlocus = 0;

        //1b - fills array with random values 1-100
        for (int i = 0; i < dataPoints.length; i++){
            dataPoints[i] = rand.nextInt(100) + 1;

        }
        //1c - Prints whole Array
        for (int i = 0; i < dataPoints.length; i++){
            System.out.print(dataPoints[i] + " | ");

        }
        System.out.println();

        //2a - Get Integer User wants to search for
        userSearch = SafeInput.getRangedInt(scan, "Search for Value (1-100): ", 1, 100);

        //2b - Linear Scan for how many times userSearch is found in dataPoints
        for (int i = 0; i < dataPoints.length; i++){
            if (dataPoints[i] == userSearch){
                count += 1;
            }
        }
        System.out.println("Found " + count);

        //2c - Get Integer User wants to search for
        userSearch = SafeInput.getRangedInt(scan, "Search for Value (1-100): ", 1, 100);

        //2c - Linear Scan for first position of userSearch in dataPoints
        for (int i = 0; i < dataPoints.length; i++){
            if (dataPoints[i] == userSearch){
                locus = i;
                break;
            }
        }
        //2c - Determine if value exists in Array && output to user
        if (locus >= 0) {
            System.out.println(userSearch + " found at Array Position " + locus);
        }
        else{
            System.out.println("Value " + userSearch + " not found in Array.");
        }
        System.out.println();

        //2d - Linear Scan for min/max values
        min = dataPoints[0];
        max = dataPoints[0];
        for (int i = 0; i < dataPoints.length; i++){
            if (dataPoints[i] > max){
                max = dataPoints[i];
                maxlocus = i;
            }
            if (dataPoints[i] < min){
                min = dataPoints[i];
                minlocus = i;
            }
        }
        System.out.println("Min: " + min + ", found at locus: " + minlocus);
        System.out.println("Max: " + max + ", found at locus: " + maxlocus);
        System.out.println();

        //2e - call method getAverage
        System.out.println("Average of Array: " + getArrayAverage(dataPoints));
        System.out.println();

        //Testing Methods
        /*
        int min1 = ArrayMethods.getMin(dataPoints);
        System.out.println("Min: " + min1);
        int max1 = ArrayMethods.getMax(dataPoints);
        System.out.println("Max: " + max1);
        int occurrence = ArrayMethods.occurrenceScan(dataPoints, 5);
        System.out.println("Occurrence: " + occurrence);
        int sum1 = ArrayMethods.intSum(dataPoints);
        System.out.println("Sum: " + sum1);
        boolean contains = false;
        contains = ArrayMethods.contains(dataPoints, 5);
        if (!contains) {
            System.out.println("Contains = false");
        }
        else {
            System.out.println("Contains = true");
        }
         */

    }
    //2e - method for getting average of an array with double values

    public static double getArrayAverage(int values[]){
        double average = 0;
        double sum = 0;
        for (int i = 0; i < values.length; i++){
            sum = sum + values[i];
        }
        average = sum / values.length;

        return average;
    }

}




