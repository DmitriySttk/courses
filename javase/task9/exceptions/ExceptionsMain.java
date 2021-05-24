package javase.task9.exceptions;

public class ExceptionsMain {
    public static void main(String[] args) {
        SimpleClass area = new SimpleClass();
        System.out.println(area.area(2, 3));

        SimpleClass divide = new SimpleClass();
        try{

            double result = divide.divideByNumber(12,4);
            System.out.println("result = "+result);
        }
        catch (SimpleDivideException ex){
            System.out.println(ex.getMessage());
            System.out.println("divide by "+ex.getNumber());
        }
        finally {
            System.out.println("you're awesome");
        }

    }
}
