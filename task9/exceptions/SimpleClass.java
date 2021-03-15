package task9.exceptions;

public class SimpleClass {

    public static int area(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Negative size(s): w = " + width + ", h = " + height);
        }
        return width * height;
    }

}
