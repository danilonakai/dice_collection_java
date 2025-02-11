package assignment4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Implementation of the main class that manipulate the
 * Die and DiceCollection models to roll the dice.
 *
 * @author Danilo Nakai
 */
public class Main {
    /**
     * A method to test the object
     *
     * @param args unused
     **/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner object to prompt the user
        ArrayList sidesList = new ArrayList(); // A list of sides to create the dice collection
        boolean loop = true; // Boolean value to check if keep playing

        System.out.println("How many dice?"); // Ask the user
        int diceNumber = input.nextInt(); // Get the answer

        for (int i = 1; i <= diceNumber; i++) { // Create a loop according to the user's answer
            System.out.println("How many sides for dice " + i + "?"); // Ask the user
            int sides = input.nextInt(); // Get the answer

            sidesList.add(sides); // Add to the list of sides the side typed by the user
        }

        DiceCollection diceCollection = new DiceCollection(sidesList); // Create a new DiceCollection
        diceCollection.rollAllDice(); // Roll all the dice
        System.out.println(diceCollection.toString()); // Report the current situation of the dice collection

        while (loop) { // Create a loop until user quit
            System.out.println("1=roll once, 2=roll 100000 times, 3=quit: "); // Ask the user to do an action

            switch (input.nextInt()) {
                case 1:
                    diceCollection.rollAllDice(); // Roll all dice once
                    System.out.println(diceCollection.toString()); // Report the current situation
                    break;

                case 2:
                    System.out.println(diceCollection.histogram(100000)); // Report the histogram of the dice collection
                    break;

                case 3:
                    System.out.println("BYE!"); // Say good bye :)
                    loop = false; // Break the loop
                    break;
            }
        }
    }
}