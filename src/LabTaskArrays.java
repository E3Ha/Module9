import java.util.*;

public class LabTaskArrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        //1a - declare array with length 100
        int [] dataPoints = new int [100];
        int sum = 0;
        double average = 0;

        //1b - fills array with random values 1-100
        for (int i = 0; i < dataPoints.length; i++){
            dataPoints[i] = rand.nextInt(100) + 1;

        }
        //1c - Prints whole Array
        for (int i = 0; i < dataPoints.length; i++){
            System.out.print(dataPoints[i] + " | ");

        }
        System.out.println();

        //1d - Calculates Sum
        for (int i = 0; i < dataPoints.length; i++){
                sum = sum + dataPoints[i];
        }
        //1d - Calculates Average
        average = sum / dataPoints.length;

        //1d - Output to User
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

    }
}




