package task3_cats;

public class MainCats {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat doCat = new Cat(12, "Dawg");

        cat.tenCatsWithDefaultFields();
        cat.tenCatsWithFori();
        doCat.tenCatsDoWhile();
        cat.fiveForEachCats();

    }

}
