import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
//Imports every utility
//import java.util.*;

public class NoteAssignment {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int [] myArray = new int [100];
        int count = 0;

        for (int i = 0; i < 100; i++){
            myArray[i] = count;
            count +=2;

        }
        for (int i = 0; i < 100; i++){
            System.out.print(myArray[i] + " | ");

        }

    }
}