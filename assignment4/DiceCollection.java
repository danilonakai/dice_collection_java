package assignment4;

import java.util.ArrayList;

/**
 * Implementation of the DiceCollection class that
 * create the dice collection, roll all dice and report some information.
 *
 * @author Danilo Nakai
 */
public class DiceCollection {
    /**
     * Dice collection list
     **/
    private ArrayList diceCollection = new ArrayList(); // The list of dice objects

    /**
     * Constructor of the DiceCollection class
     * Create all dice and add to the Dice Collection list
     *
     * @param dice The dice side values
     **/
    public DiceCollection(ArrayList dice) {
        for (int i = 0; i < dice.size(); i++) {
            diceCollection.add(new Die((Integer) dice.get(i))); // Create the die passing the number of sides
        }
    }

    /**
     * Roll all dice at the same time
     **/
    public void rollAllDice() {
        for (int i = 0; i < diceCollection.size(); i++) {
            Die newDie = (Die) diceCollection.get(i); // Get the current die

            newDie.roll(); // Roll the die
        }
    }

    /**
     * Get the current sum of all dice sides
     *
     * @return current sum of all dice sides
     **/
    public int getCurrentSum() {
        int sum = 0; // The sum variable that will be incremented

        for (int i = 0; i < diceCollection.size(); i++) {
            Die newDie = (Die) diceCollection.get(i); // Get the current die

            sum = sum + newDie.getCurrentSide(); // Sum the die's side to the result variable
        }

        return sum; // Return the total sum
    }

    /**
     * Get the minimum possible roll sum
     *
     * @return minimum possible sum
     **/
    public int getMinimum() {
        return diceCollection.size(); // Return the minimum possible sum
    }

    /**
     * Get the maximum possible roll sum
     *
     * @return maximum possible sum
     **/
    public int getMaximum() {
        int maximum = 0; // Initialize the maximum variable

        for (int i = 0; i < diceCollection.size(); i++) {
            Die newDie = (Die) diceCollection.get(i); // Get the current die

            maximum = maximum + newDie.getNumberOfSides(); // Increment the current die's side to the maximum variable
        }

        return maximum; // Return the maximum possible sum
    }

    /**
     * @return a string that report all the information about the dice collection
     **/
    @Override
    public String toString() {
        String result = "Dice Collection:\n"; // Initialize the result variable

        for (int i = 0; i < diceCollection.size(); i++) {
            Die newDie = (Die) diceCollection.get(i); // Get the current die

            result = result + "d" + (i + 1) + "= " + newDie.getCurrentSide() + "\n"; // Add the information of the current die
        }

        result = result + "\n" + "Min= " + getMinimum() + " Max= " + getMaximum() + " Current= " + getCurrentSum() + "\n"; // Add the minimum and maximum possible sum and the actual current sum

        return result; // Return the final result
    }

    /**
     * @param numberOfRolls The number of rolls to do
     * @return a string that report the histogram of the dice collection
     **/
    public String histogram(int numberOfRolls) {
        String result = ""; // Initialize the result variable
        int minimum = getMinimum(); // Get the minimum possible sum
        int maximum = getMaximum() + 1; // Get the maximum possible sum
        int[] histogram = new int[maximum]; // Initialize the histogram list

        for (int i = 0; i < numberOfRolls; i++) {
            rollAllDice(); // Roll all dice at once
            histogram[getCurrentSum()]++; // Increment the current value in the histogram list
        }

        for (int i = minimum; i < maximum; i++) {
            result = result + i + ": " + histogram[i] + "\n"; // Add to the result variable the respective values of the histogram
        }

        return result; // Return the complete histogram
    }
}
