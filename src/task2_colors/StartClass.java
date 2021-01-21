package task2_colors;

import java.util.Scanner;

public class StartClass {

    public static void main(String[] args) {
        System.out.println("Сhoose a rainbow color in the format 1-7 for single color or 11-77 for a mixed color");
        // System.out.println("please don't use numbers above 7 :)");
        while (true) {
            printColor();
        }

    }

    public static void printColor() {
        Scanner in = new Scanner(System.in);
        Rainbow rainbow = new Rainbow();
        int enteredNumber = in.nextInt();
        if (enteredNumber >= 1 && enteredNumber <= 7) {
            System.out.println("Your color is " + rainbow.colorSelection(singleColor(enteredNumber)));
        }
        if (enteredNumber >= 11 && enteredNumber <= 77) {
            mixedColor(enteredNumber);
        }
    }

    public static int singleColor(int s) {
        return Integer.parseInt(String.valueOf(s));
    }

    public static void mixedColor(int s) {
        Rainbow mixedColors = new Rainbow();
        String enteredNumber = String.valueOf(s);
        char firstNumber = enteredNumber.charAt(0);
        char secondNumber = enteredNumber.charAt(1);
        int outFirstColor = Integer.parseInt(String.valueOf(firstNumber));
        int outSecondColor = Integer.parseInt(String.valueOf(secondNumber));
        if (outFirstColor == outSecondColor)
            System.out.println("Your color is " + mixedColors.colorSelection(outFirstColor));
        else
            System.out.println("Your color is " + mixedColors.colorSelection(outFirstColor) + "-" + mixedColors.colorSelection(outSecondColor));

    }

}