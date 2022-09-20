import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] alphabetic = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "zero"};

        Translator translator = new Translator(alphabetic, numeric);

        boolean play = true;
        String invalid = "invalid";

        Scanner scanner = new Scanner(System.in);

        while (play == true) {
            System.out.println("Type 'x' to stop \n Type 'v' to translate");
            String input = scanner.nextLine();

            if (input == "x") {
                play = false;
            } else if (input == "v") {
                System.out.println("Type a number from 0 to 9");

                int number = scanner.nextInt();
                scanner.nextLine();

                if (number < 10) {
                    String result = (translator.translate(number));
                    System.out.println("Translate of" + number + "is: " + result);
                } else {
                    System.out.println(invalid);
                }
            }

        }
    }
}
