package task4_matrix;

import java.util.Arrays;

public class Matrix {
    private final String[][] matrix = new String[10][10];
    private final String[] mainDiagonal = new String[10];
    private final String[] antiDiagonal = new String[10];
    private final String[] mixedArray = new String[20];
    private final String[] arrayForRoundedDouble = new String[8];


    public String[] getMainDiagonal() {
        return mainDiagonal;
    }

    public String[] getAntiDiagonal() {
        return antiDiagonal;
    }

    //заполнение матрицы
    public void matrixFill() {
        Generators gen = new Generators();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j % 3 == 0) {
                    matrix[i][j] = gen.convertDoubleToString();
                } else {
                    matrix[i][j] = gen.stringGenerator();
                }
            }
        }
    }

    //вывод матрицы
    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //заполнение массива элементами прямой  диагонали
    public void mainDiagFll() {
        for (int i = 0; i < matrix.length; i++) {
            mainDiagonal[i] = matrix[i][i];
        }
    }

    //заполнение массива элементами побочной диагонали
    public void antiDiagFll() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                antiDiagonal[i] = matrix[i][matrix.length - 1 - i]; //рот ебал, 2 часа, сука, на одну строку убить. не забыть удалить коммент
            }
        }
    }

    //сравнение объектов и элементов массивов
    public void comparisonOfArrays() {
        System.out.println();
        System.out.println("Comparison main and antidiagonal");
        System.out.println("main diagonal equals antidiagonal: " + mainDiagonal.equals(antiDiagonal));
        System.out.println("arrays: " + Arrays.equals(mainDiagonal, antiDiagonal));
        System.out.println();
    }

    //заполнение смешанного массива элементами диагоналей
    public void mixArray() {
        for (int i = 0; i < 10; i++) {
            mixedArray[i] = mainDiagonal[i];
        }
        for (int i = 0; i < 10; i++) {
            mixedArray[i + 10] = antiDiagonal[i];
        }

    }

    public void numbersAndLetters() {

        char tempChar = ' ';
        String tempString = "";
        String doubleTOString;
        double tempDouble = 0;
        int tempCount = 0;
        for (int i = 0; i < mixedArray.length; i++) {

            tempString = mixedArray[i];
            tempChar = tempString.charAt(0);
            if (tempChar == '0' || tempChar == '1' || tempChar == '2' || tempChar == '3' || tempChar == '4' ||
                    tempChar == '5' || tempChar == '6' || tempChar == '7' || tempChar == '8' || tempChar == '9') {

                tempDouble = Double.parseDouble(tempString);
                if (tempDouble > 1.7) {
                    tempDouble = Math.ceil(tempDouble);
                } else {
                    tempDouble = Math.floor(tempDouble);
                }
                doubleTOString = String.valueOf(tempDouble);

                for (int j = 0; j < arrayForRoundedDouble.length; j++) {
                    arrayForRoundedDouble[tempCount] = doubleTOString;
                }
                tempCount++;
            }

        }
        for (int i = 0; i < arrayForRoundedDouble.length; i++) {
            System.out.print(arrayForRoundedDouble[i] + "_");
        }
    }
}