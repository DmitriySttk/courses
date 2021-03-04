package task7.myarraylist.classes;


public class MyArrayListMain {
    public static void main(String[] args) {
        MyArrayList<String> array = new MyArrayList<>(5);
        int a;
        String b;

        array.set(2, "two");
        array.add(10, "ten");
        System.out.println(array.size());
        array.add(4, "four");
        array.add(12, "seven");
        array.add(16, "sixteen");
        array.set(3, "three");
        array.add(8, "seven");

//        for (String i : array) {
//            System.out.println(i);
//        }
//
//      a= array.indexOf("three");
//        a = array.lastIndexOf("seven");
//        b=array.remove(2);
//        System.out.println(b);
//        System.out.println(array.get(2));
        MyArrayList<String> array2 = (MyArrayList<String>) array.subList(1,10);
        for (String i : array2) {
            System.out.println(i);
        }
    }
}
