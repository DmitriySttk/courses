package task4_matrix;

import java.util.Random;

public class Generators {


    public String stringGenerator() {

        int leftLimit = 65; // letter 'A'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 6;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }

    public Double doubleGenerator() {
        double generatedDouble = Math.random()*(Double.MAX_VALUE-Double.MIN_VALUE)+Double.MIN_VALUE;
        return generatedDouble;
    }
}
