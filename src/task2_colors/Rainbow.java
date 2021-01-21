package task2_colors;

public class Rainbow {
    private final String[] COLOR_NAME = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
    private int color;

    public String getColorName(int i) {
        return COLOR_NAME[i];
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    //тут свич цветов, мб не выводить, а передавать элемент массива при вызове
    public String colorSelection(int input) {
        String color = "";
        setColor(input);
        switch (getColor()) {
            case (1):
                color = getColorName(0);
                break;
            case (2):
                color = getColorName(1);
                break;
            case (3):
                color = getColorName(2);
                break;
            case (4):
                color = getColorName(3);
                break;
            case (5):
                color = getColorName(4);
                break;
            case (6):
                color = getColorName(5);
                break;
            case (7):
                color = getColorName(6);
                break;
        }
        return color;
    }
}