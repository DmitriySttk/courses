package task9.exceptions;

public class SimpleClassException extends Exception {
    private double number;

    public double getNumber() {
        return number;
    }

    public SimpleClassException(String message, double num) {
        super(message);
        number = num;
    }

}
