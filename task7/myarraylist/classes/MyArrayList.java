package task7.myarraylist.classes;

import task7.myarraylist.interfaces.MyList;

import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {

    private E[] values;

    public MyArrayList() {
        values = (E[]) new Object();
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public void delete(int index) {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {

    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }

//    public MyArrayList() {
//    }
//
//    MyArrayList(MyList<? extends E> col) {
//
//    }
//
//    MyArrayList(int capacity) {
//
//    }
//
//    @Override
//    public boolean add(Object o) {
//        return false;
//    }
}
