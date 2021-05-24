package javase.task4.matrix;

import java.util.Random;

public class Generators {

    //генератор литеральных строк
    public String stringGenerator() {

        int leftLimit = 65; //   'A'
        int rightLimit = 122; // 'z'
        int targetStringLength = 6;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }

    //генератор дабла
    public Double doubleGenerator() {
        double generatedDouble = Math.random() * (Double.MAX_VALUE - Double.MIN_VALUE) + Double.MIN_VALUE;
        return generatedDouble;
    }

    //переводит дабл в строку и возвращает 6 первых символов
    public String convertDoubleToString() {

        String result = "";
        char temp = ' ';
        String convert = String.valueOf(doubleGenerator());
        for (int i = 0; i < 6; i++) {
            temp = convert.charAt(i);
            result = result + temp;
        }
        return result;
    }
}
