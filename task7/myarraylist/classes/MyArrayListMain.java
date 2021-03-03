package task7.myarraylist.classes;

public class MyArrayListMain {
    public static void main(String[] args) {
        MyArrayList<String> array = new MyArrayList<>(5);
        int a;

        array.set(2, "two");
        // System.out.println(array.get(2));
        array.add(10, "ten");
        System.out.println(array.size());
//        System.out.println(array.get(9)+" "+array.get(2));
        array.add(4, "four");
        array.add(12, "seven");
        array.add(16, "sixteen");
        array.set(3, "three");
        array.add(8, "seven");

        for (String i : array) {
            System.out.println(i);
        }

//      a= array.indexOf("three");
        a = array.lastIndexOf("seven");
        System.out.println(a);

    }
}
