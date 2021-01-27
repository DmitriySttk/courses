package task4_matrix;

import java.util.Arrays;

public class Matrix {
    private String[][] matrix = new String[10][10];
    private String[] mainDiagonal = new String[10];
    private String[] antiDiagonal = new String[10];

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
                antiDiagonal[i] = matrix[i][matrix.length-1-i]; //рот ебал, 2 часа, сука, на одну строку убить. не забыть удалить коммент
            }
        }


    }
    public void comparisonOfArrays(){
        System.out.println();
        System.out.println("Comparison main and antidiagonal");
        System.out.println("main diagonal equals antidiagonal: "+mainDiagonal.equals(antiDiagonal));
        System.out.println("arrays: "+ Arrays.equals(mainDiagonal, antiDiagonal));
    }
}