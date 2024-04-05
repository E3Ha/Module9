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
        int locus = 0;

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
        //if (locus >= 0) {
            System.out.println(userSearch + " found at Array Position " + locus);
        //}
        //else {
        //    System.out.println(userSearch + " not found in Array.");
        //}



    }
}




