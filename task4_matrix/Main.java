package task4_matrix;

public class Main {
    public static void main(String[] args) {
        Generators str = new Generators();
        String a = str.stringGenerator();
        System.out.println(a);
        System.out.println(convertDoubletoString());


    }

    public static String convertDoubletoString() {
        Generators in = new Generators();
        String result = "";
        char temp = ' ';
        String convert = String.valueOf(in.doubleGenerator());
        for (int i = 0; i < 6; i++) {
            temp = convert.charAt(i);
            result = result + temp;
        }
        return result;
    }

    public static void matrix(String convertedDouble, String randomStr){
        String matrix [][] = new String[10][10];

    }

}
