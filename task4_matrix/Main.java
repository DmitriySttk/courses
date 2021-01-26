package task4_matrix;

public class Main {
    public static void main(String[] args) {
        Generators str = new Generators();
//        String a = str.stringGenerator();
//        System.out.println(a);
//        String b = str.convertDoubleToString();
//        System.out.println(b);

        matrix();
    }

//добавить класс матрица и перенести туда методы для заполнения и вывода+ методы для дейсвтий
    public static void matrix() {
        Generators gen = new Generators();
        String matrix[][] = new String[10][10];
        //заполнение матрицы
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j % 3 == 0) {
                    matrix[i][j] = gen.convertDoubleToString();
                } else {
                    matrix[i][j] = gen.stringGenerator();
                }
            }
        }
        //вывод матрицы
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
