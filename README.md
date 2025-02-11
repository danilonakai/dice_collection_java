# Dice Collection in Java

## Overview

This college assignment in Java involves creating a simulation of dice rolls using arrays. The project defines two main classes: Die and DiceCollection. The goal is to create a set of dice with varying numbers of sides and simulate rolling them multiple times. The results are stored in a histogram, tracking the frequency of each possible sum.

The project is structured as follows:
- **Die**: Represents an individual die with a configurable number of sides.
- **DiceCollection**: A collection of multiple `Die` objects. It allows rolling all dice and calculating various statistics like the sum, maximum, and minimum rolls.
- **Histogram**: A method that records how many times each possible sum occurs over a specified number of rolls.
- **Main (View)**: The main method interacts with the user to configure the dice, roll them, and display results.

## Classes and Functionality

### Die Class
- Represents a single die with a configurable number of sides.
- Can:
  - Report the number of sides.
  - Report the current side showing.
  - Roll the die to generate a random number between 1 and its number of sides.
  - Display its state with a `toString()` method showing the number of sides and the current showing face.

### DiceCollection Class
- A collection of `Die` objects, where each die can have a different number of sides.
- Can:
  - Report the sum of all currently showing faces of the dice.
  - Report the maximum and minimum possible sums from the dice.
  - Roll all dice simultaneously.
  - Display the collection of dice and relevant statistics with the `toString()` method.
  - Provide a histogram method to simulate multiple rolls and track the frequency of each possible sum.

### Histogram Method
- Accepts a parameter specifying the number of rolls.
- Rolls all dice the specified number of times.
- Returns an array (histogram) where each index corresponds to a possible sum of the dice, and the value at that index represents how many times that sum occurred.

### Main Method (View)
- Prompts the user to enter the number of dice and the number of sides for each die.
- Creates a `DiceCollection` based on the user's input and prints the collection to the screen.
- Displays a menu allowing the user to either roll once or roll the dice 100,000 times.
  - If "roll once" is selected: Displays the result of rolling all dice once.
  - If "100,000 rolls" is selected: Calls the histogram method, then prints the non-zero elements of the histogram array.

## UML Diagram
Below is the UML class diagram representing the structure of the project, including the `Die` and `DiceCollection` classes and their association:
![assignment4 drawio](https://github.com/user-attachments/assets/44f3eaec-6e84-4e73-b91a-ac8778bcc518)

## Getting Started:
1. Clone the repository to your local machine.
2. Open the project in **IntelliJ IDEA** (Community Edition).
3. Make sure to use **Java Version 15** (Liberica JDK 15) or higher.
3. Compile and run `Main.java` using any IDE or the command line.

## Screenshots:
![image](https://github.com/user-attachments/assets/2741fba1-4a1e-4ce1-9201-71d19dbd8b7f)



