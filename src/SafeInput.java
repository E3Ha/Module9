import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SafeInput {

    public static String yourName(Scanner pipe){
        String fname = "";
        String lname = "";

        System.out.println("First Name: ");
        fname = pipe.nextLine();

        System.out.println("Last Name: ");
        lname = pipe.nextLine();

        return fname + " " + lname;
    }

    public static int twoNumbers(int a, int b){

        int c = 0;

        c = a + b;

        return c;
    }


    public static void prettyHeader(String msg) {

        int totalSpaces = 60 - 6 - msg.length();
        int leftSpace;
        int rightSpace;

        if (totalSpaces % 2 == 0){
            leftSpace = rightSpace = totalSpaces / 2;
        }
        else{
            rightSpace = totalSpaces / 2;
            leftSpace = rightSpace + 1;
        }


        //Print Top Border
        for(int i = 0; i <= 61; i++){

            System.out.print("*");

        }
        System.out.println("");
        //First 3 *s
        System.out.print("***");
        //LeftSpaces
        for(int i = 0; i <= leftSpace; i++){
            System.out.print(" ");
        }
        //Print Message
        System.out.print(msg);
        //RightSpaces
        for(int i = 0; i <= rightSpace; i++){
            System.out.print(" ");
        }
        //Last 3 *s
        System.out.print("***");
        System.out.println("");

        //Bottom Border
        for(int i = 0; i <= 61; i++){

            System.out.print("*");

        }

       return;
    }
    //Code Provided - Returns a String
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */

    public static String getNonZeroLenString(Scanner pipe, String prompt){
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }
        while(retString.length() == 0);
        return retString;
    }

    //Returns an Integer
    public static int getInt(Scanner pipe, String prompt){
        boolean done = false;
        String trash = "";
        int i = 0;

        do{
            // Show Prompt
            System.out.print("\n" +prompt);
            //Check if integer
            if (pipe.hasNextInt()) {
                i = pipe.nextInt();
                done = true;
                System.out.println();
            }
            //Otherwise trash & loop
            else {
                trash = pipe.nextLine();
                System.out.println("Incorrect Input");
            }

        }
        while (done == false);
        return i;
    }

    //Returns a Double
    public static double getDouble(Scanner pipe, String prompt){
        boolean done = false;
        String trash = "";
        double d = 0;

        do{
            // Show Prompt
            System.out.println("\n" +prompt);
            //Check if double
            if (pipe.hasNextDouble()) {
                d = pipe.nextDouble();
                done = true;
                System.out.println();
            }
            //Otherwise trash & loop
            else {
                trash = pipe.next();
                System.out.println("Incorrect Input");
            }

        }
        while (done == false);
        return d;
    }

    //Returns an Integer in a Range the User Inputs
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high){
        boolean done = false;
        String trash = "";
        int ri = 0;

        do{
            //Show Prompt
            System.out.print("\n" +prompt);
            //Check if integer
            if (pipe.hasNextInt()) {
                ri = pipe.nextInt();
                if (ri <= high && ri >= low){
                    done = true;
                }
                else{
                    System.out.println("Not in Range");
                }
            }
            //Otherwise trash & loop
            else {
                trash = pipe.next();
                System.out.println("Incorrect Input");
            }
        }
        while (done == false);
        return ri;
    }

    //Returns a Double in a Range the User Inputs
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high){
        boolean done = false;
        String trash = "";
        double rd = 0;

        do{
            //Show Prompt
            System.out.print("\n" +prompt);
            //Check if integer
            if (pipe.hasNextDouble()) {
                rd = pipe.nextDouble();
                if (rd <= high && rd >= low){
                    done = true;
                }
                else{
                    System.out.println("Not in Range");
                }
            }
            //Otherwise trash & loop
            else {
                trash = pipe.next();
                System.out.println("Incorrect Input");
            }
        }
        while (done == false);
        return rd;
    }

    //Returns Yes or No to a Prompt
    public static boolean getYNConfirm(Scanner pipe, String prompt){
        boolean y = false;
        String trash = "";
        boolean done = false;

        do {
            //Show Prompt
            System.out.print("\n" + prompt);
            //Check if a String
            if (pipe.hasNextLine()) {
                trash = pipe.next();
                trash = trash.toLowerCase();
                //Check if Yes or No
                switch (trash) {
                    case "y":
                        done = true;
                        break;
                    case "n":
                        y = true;
                        done = true;
                        break;
                    default:
                        System.out.println("Incorrect Input");
                        break;
                }
            }
            //Else - not a String
            else {
                trash = pipe.next();
                System.out.println("Incorrect Input");
            }
        }
        while (done == false);
        return y;
    }

    //Returns a String that matches a RegEx pattern
    public static String getRegExString(Scanner pipe, String prompt, String regEx){
       //converting string to regex
       Pattern pattern = Pattern.compile(regEx);
       boolean done = false;


       do {
          //Show Prompt
          System.out.println("\n" + prompt);
          //collecting input
          String input = pipe.nextLine();
          //checking for match
          Matcher matcher = pattern.matcher(input);
          //return match found if match
          if (matcher.find())
              return "Match Found";
          }
          while (done == false);
          //Unused
          return "match not found";
   }














}





















