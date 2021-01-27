package task4_matrix;

public class Matrix {
    private String[][] matrix = new String[10][10];
    private String[] directDiagonal = new String[10];
    private String[] sideDiagonal = new String[10];

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
    public void drctDiagFll() {
        for (int i = 0; i < matrix.length; i++) {
                directDiagonal[i] = matrix[i][i];
            }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(directDiagonal[i]);
        }
    }
//заполнение массива элементами побочной диагонали
    public void sideDiagFll() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sideDiagonal[i] = matrix[i][matrix.length-1-i]; //рот ебал, 2 часа, сука, на одну строку убить. не забыть удалить коммент
            }
        }
        for (int i = 0; i < sideDiagonal.length; i++) {
            System.out.println(sideDiagonal[i]);
        }

    }
}