package task3_cat;

public class Cat {
    private int catAge = 5;
    private String catName = "mr.Meowster";

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

    public void tenCatsWithDefaultFields(){

        int counter = 1;
        while (counter<=10){
            System.out.println(counter+".Cat Name: "+getCatName()+"\n  Cat Age: "+getCatAge());
            counter++;
        }
    }

    public void tenCatsWithFori(){
        for (int i = 0; i < 10; i++) {
            setCatName("Meowler"+Integer.toString(i));
            setCatAge(1+i);
            System.out.println(i+".Cat Name: "+getCatName()+"\n  Cat Age: "+getCatAge());

        }
    }

    @Override
    public String toString() {
        return "Cat Name: "+getCatName()+"\nCat  Age: "+getCatAge();
    }
}
