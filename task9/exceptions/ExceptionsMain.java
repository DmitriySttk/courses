package task9.exceptions;

public class ExceptionsMain {
    public static void main(String[] args) {
        SimpleClass area = new SimpleClass();
        System.out.println(area.area(2, 3));

        SimpleClass devide = new SimpleClass();
        try{

            double result = devide.divideByOddNumber(2,5);
            System.out.println(result);
        }
        catch (SimpleClassException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }

    }
}
