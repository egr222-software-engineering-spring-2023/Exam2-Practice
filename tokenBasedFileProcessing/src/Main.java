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
            String name = input.next();
            System.out.print(name + ":");
            int points = 0;
            int count = 0;
            while (input.hasNextInt()) {
                int nextPoints = input.nextInt();
                points += nextPoints;
                count++;
                System.out.print(" " + nextPoints);
            }
            System.out.println();
            double average = (double) points / count;
            System.out.println("average = " + average);
        }
    }
}