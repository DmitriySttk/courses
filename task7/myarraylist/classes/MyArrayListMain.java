package task7.myarraylist.classes;

public class MyArrayListMain {
    public static void main(String[] args) {
        MyArrayList<String> array = new MyArrayList<>(5);

        array.set(2,"ss");
        System.out.println(array.get(2));
    }
}
