import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner x = new Scanner(new File("records.txt"));

        tallyScores(x);
    }

    public static void tallyScores(Scanner input) {
        while (input.hasNext()) {
            String name = input.next();     // read the first entry for the next person (which is the NAME)
            System.out.print(name + ":");   // print the name (which is guaranteed to exist)
            int points = 0;                 // initialize the total points (used to calculate average)
            int count = 0;                  // initialize the number of scores (used to calculate average)
            while (input.hasNextInt()) {    // check for next integer (if there is no next integer we are either at the end or moving to the next person)
                int nextPoints = input.nextInt();   // get next score
                points += nextPoints;               // increment total point count
                count++;                            // increment number of scores
                System.out.print(" " + nextPoints); // print out the next score (can be done in the loop until there are no more scores)
            }   // exit loop when there are no more scores for current person (i.e., the next token is NOT an integer)
            System.out.println();
            double average = (double) points / count;   // calculate the average score the previous person
            System.out.println("average = " + average); // print out average
        }   // exit loop when there are no more tokens to process (if there is one then it MUST be a NAME and there must be at least one score)
    }
}