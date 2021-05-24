package javase.task9.exceptions;

public class SimpleDivideException extends Exception {
    private double number;

    public double getNumber() {
        return number;
    }

    public SimpleDivideException(String message, double num) {
        super(message);
        number = num;
    }

}
