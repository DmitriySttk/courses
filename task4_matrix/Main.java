package task4_matrix;

public class Main {
    public static void main(String[] args) {
        Generators str = new Generators();
        Matrix mat = new Matrix();


       mat.matrixFill();
       mat.printMatrix();


       mat.sideDiagFll();
        System.out.println();
        mat.drctDiagFll();
    }



}
