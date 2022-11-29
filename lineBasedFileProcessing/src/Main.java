import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner x = new Scanner(new File("./lineBasedFileProcessing/records.txt"));

        underline(x);
    }

    public static void underline(Scanner input) {
        while (input.hasNextLine()) {           // confirm there is a line to echo to the console
            String text = input.nextLine();     // get the entire next LINE and store in the String variable text
            if (!text.startsWith(".")) {        // if the line does NOT start with a . then simply echo it (no additional work to do)
                System.out.println(text);
            } else {                            // ELSE the line DOES start with a period
                System.out.println(text.substring(1));      // print out the line beginning at index 1 (ignore the .)
                for (int i = 1; i <= text.length() - 1; i++) {       // for each character print out a hyphen to act as the underline
                    System.out.print("-");
                }
                System.out.println();           // print out an end of line before looping
            }
        }
    }
}