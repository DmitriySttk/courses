package task3.cats;

import java.util.Objects;

public class Cat {
    private int catAge = 5;
    private String catName = "mr.Meowster";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return catAge == cat.catAge &&
                catName.equals(cat.catName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catAge, catName);
    }

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
        System.out.println("10 cats with default name and age fields (while+override):");
        while (counter <= 10) {
            System.out.println(counter + ". " + toString());
            counter++;
        }
        System.out.println();
    }

    public void tenCatsWithFori() {
        System.out.println("10 cats with same name and random age fields (for cycle):");
        for (int i = 1; i <= 10; i++) {
            setCatName("Meowler" + i);
            setCatAge((int) (Math.random() * 14 + 1));
            System.out.println(i + ".Cat Name: " + getCatName() + " age " + getCatAge());
        }
        System.out.println();
    }

    public void tenCatsDoWhile() {

        int counter = 1;
        System.out.println("10 cats are initialized in the constructor (do-while):");
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
        System.out.println("foreach cats. go to hell:");
        for (String i : result) {
            System.out.println(i);
        }

        System.out.println();
    }

}
