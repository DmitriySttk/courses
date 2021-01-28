package task2_colors;

public class MainRainbow {

    public static void main(String[] args) {
        System.out.println("Сhoose a rainbow color in the format 1-7 for single color or 11-77 for a mixed color");
        // System.out.println("please don't use numbers above 7 :)");
        Rainbow color = new Rainbow();
        while (true) {
            color.printColor();

        }
    }
}