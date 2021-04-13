import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner x = new Scanner(new File("records.txt"));

        underline(x);
    }

    public static void underline(Scanner input) {
        while (input.hasNextLine()) {
            String text = input.nextLine();
            if (!text.startsWith(".")) {
                System.out.println(text);
            } else {
                System.out.println(text.substring(1));
                for (int i = 1; i <= text.length() - 1; i++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        }
    }
}