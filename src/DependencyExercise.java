import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class DependencyExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Something: Life, The Universe, and Everything");
        String userInput = sc.nextLine();
        System.out.println("You Entered: \"" + userInput + "\"");
        if (!StringUtils.isNumeric(userInput)){
            System.out.println(userInput + " is not a number");
        }
        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));
    }

}
