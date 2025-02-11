package assignment4;

import java.util.Random;

/**
 * Implementation of the Die class that create the die
 * roll it and report some specific information.
 *
 * @author Danilo Nakai
 */
public class Die {
    /**
     * Number of sides of the die
     **/
    private int numberOfSides;

    /**
     * Current side of the die
     **/
    private int currentSide;

    /**
     * Constructor of the Die class
     * Create the die passing the number of sides
     *
     * @param sides The number of sides of the die
     **/
    public Die(int sides) {
        numberOfSides = sides; // The number of sides of the die
    }

    /**
     * Get the number of sides of the die
     *
     * @return the number of sides of the die
     **/
    public int getNumberOfSides() {
        return numberOfSides; // Return the number of sides of the die
    }

    /**
     * Get the current side of the die
     *
     * @return the current side of the die
     **/
    public int getCurrentSide() {
        return currentSide; // Return the current side of the die
    }

    /**
     * Roll the die
     **/
    public void roll() {
        Random random = new Random(); // Random object used to get a random side number for the die
        int randomNumber = random.nextInt((numberOfSides + 1) - 1) + 1; // Get the random side number for the die

        currentSide = randomNumber; // Change the current side value
    }

    /**
     * @return a string that report all the information about the die
     **/
    @Override
    public String toString() {
        return "Die{" +
                "numberOfSides=" + numberOfSides +
                ", currentSide=" + currentSide +
                '}';
    }
}
