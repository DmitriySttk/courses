package task9.exceptions;

public class SimpleClass {

    public int area(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Negative size(s): w = " + width + ", h = " + height);
        }
        return width * height;
    }

    public double divideByNumber(double firstNumber, double secondNumber) throws SimpleClassException {
        double result;
        if (secondNumber == 0) throw new SimpleClassException("you're genius! there's your noble prize!", secondNumber);
        if (secondNumber % 2 != 0) throw new SimpleClassException("DIVIDE BY ODD NUMBER!!", secondNumber);

        result = firstNumber / secondNumber;
        return result;

    }


}
