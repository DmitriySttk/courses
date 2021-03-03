package task7.myarraylist.classes;

public class MyArrayListMain {
    public static void main(String[] args) {
        MyArrayList<String> array = new MyArrayList<>(5);

        array.set(2, "two");
        // System.out.println(array.get(2));
        array.add(10, "ten");
        System.out.println(array.size());
//        System.out.println(array.get(9)+" "+array.get(2));
        array.add(4, "four");
        array.add(7, "seven");
        array.add(16,"sixteen");
        for (String i : array) {
            System.out.println(i);
        }
    }
}
