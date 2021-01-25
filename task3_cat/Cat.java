package task3_cat;

public class Cat {
    private int catAge = 5;
    private String catName = "mr.Meowster";

    public Cat() {
    }

    public Cat(int catAge, String catName) {
        this.catAge = catAge;
        this.catName = catName;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    @Override
    public String toString() {
        return "Cat Name: " + getCatName() + " Age " + getCatAge();
    }

    public void tenCatsWithDefaultFields() {

        int counter = 1;
        while (counter <= 10) {
            System.out.println(counter + ". " + toString());
            counter++;
        }
        System.out.println();
    }

    public void tenCatsWithFori() {
        for (int i = 1; i <= 10; i++) {
            setCatName("Meowler" + i);
            setCatAge((int) (Math.random() * 14 + 1));
            System.out.println(i + ".Cat Name: " + getCatName() + " age " + getCatAge());
        }
        System.out.println();
    }

    public void tenCatsDoWhile() {

        int counter = 1;
        do {
            System.out.println(counter + ". Cat name: " + getCatName() + ", age " + getCatAge());
            counter++;
        } while (counter <= 10);
        System.out.println();
    }

    public void fiveForEachCats() {

        String[] age = new String[5];
        String[] name = new String[5];
        String[] result = new String[5];
        for (int i = 0; i < 5; i++) {
            setCatAge((int) (Math.random() * 14 + 1));
            setCatName("Meowsew" + i);
            age[i] = String.valueOf(getCatAge());
            name[i] = getCatName();
            result[i] = "Cat name: " + name[i] + " age " + age[i];
        }
        //долбаный форич
        for (String i : result) {
            System.out.println(i);
        }

        System.out.println();
    }


}
