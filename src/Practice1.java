import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
//Imports every utility
//import java.util.*;

public class Practice1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int [] myArray = new int [20];
        int min = 0;
        int minlocus = 0;

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = rand.nextInt(100);

        }
        //Prints whole Array
        for (int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " | ");
        }
        System.out.println();

        min = myArray[0];
        //Linear Scan
        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] < min){
                min = myArray[i];
                minlocus = i;
            }
        }
        System.out.println("Min: " + min + ", found at locus: " + minlocus);

    }
}
