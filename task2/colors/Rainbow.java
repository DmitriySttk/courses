package task2.colors;

import java.util.Scanner;

public class Rainbow {
    private final String[] COLOR_NAME = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
    private int color;

    public String getColorName(int i) {
        return COLOR_NAME[i];
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }


    public String colorSelection(int input) {
        String color = "";
        setColor(input);
        switch (getColor()) {
            case (1):
                color = getColorName(0);
                break;
            case (2):
                color = getColorName(1);
                break;
            case (3):
                color = getColorName(2);
                break;
            case (4):
                color = getColorName(3);
                break;
            case (5):
                color = getColorName(4);
                break;
            case (6):
                color = getColorName(5);
                break;
            case (7):
                color = getColorName(6);
                break;
        }
        return color;
    }

    public void printColor() {
        Scanner in = new Scanner(System.in);

        int enteredNumber = in.nextInt();
        if (enteredNumber >= 1 && enteredNumber <= 7) {
            System.out.println("Your color is " + colorSelection(singleColor(enteredNumber)));
        }
        if (enteredNumber >= 11 && enteredNumber <= 77) {
            mixedColor(enteredNumber);
        }
    }

    public int singleColor(int s) {
        return Integer.parseInt(String.valueOf(s));
    }

    public void mixedColor(int s) {

        String enteredNumber = String.valueOf(s);
        char firstNumber = enteredNumber.charAt(0);
        char secondNumber = enteredNumber.charAt(1);
        int outFirstColor = Integer.parseInt(String.valueOf(firstNumber));
        int outSecondColor = Integer.parseInt(String.valueOf(secondNumber));
        if (outFirstColor == outSecondColor)
            System.out.println("Your color is " + colorSelection(outFirstColor));
        else
            System.out.println("Your color is " + colorSelection(outFirstColor) + "-" + colorSelection(outSecondColor));

    }
}