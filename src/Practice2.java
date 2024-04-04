import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
//Imports every utility
//import java.util.*;

public class Practice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int [] myArray = new int [10];
        int min = 0;
        int minlocus = 0;
        int tempValue = 0;

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = rand.nextInt(100) + 1;

        }
        //Prints whole Array
        for (int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " | ");
        }
        System.out.println();

        //Switching Values/Value Swap
        tempValue = myArray[0];
        myArray[0] = myArray[9];
        myArray[9] = tempValue;

        System.out.println("Switching Values...");

        //Prints whole Array
        for (int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " | ");
        }
        System.out.println();


    }
}
