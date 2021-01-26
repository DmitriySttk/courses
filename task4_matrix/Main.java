package task4_matrix;

public class Main {
    public static void main(String[] args) {
        Generators str = new Generators();
        String a = str.stringGenerator();
        System.out.println(a);
        double b = str.doubleGenerator();
        System.out.println(convertDoubletoString(b));

    }

    public static String convertDoubletoString(double in) {
        String result = "";
        char temp = ' ';
        String convert = String.valueOf(in);
        for (int i = 0; i < 6; i++) {
            temp = convert.charAt(i);
            result = result + temp;
        }
        return result;
    }

}
