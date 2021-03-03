package task7.myarraylist.classes;

public class MyArrayListMain {
    public static void main(String[] args) {
        MyArrayList<String> array = new MyArrayList<>(5);

        array.set(2,"ss");
       // System.out.println(array.get(2));
        array.add(88,"ii");
        System.out.println(array.size());
        System.out.println(array.get(87)+" "+array.get(2));
    }
}
