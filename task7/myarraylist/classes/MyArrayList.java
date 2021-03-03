package task7.myarraylist.classes;

import task7.myarraylist.interfaces.MyList;

import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {

    private E[] values;

    MyArrayList(){
        values =(E[]) new Object[0];
    }

    MyArrayList(int capacity){
        values = (E[]) new Object[capacity];
    }


    @Override
    public void add(int index, E obj) {
        E[] temp = values;


    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public E set(int index, E obj) {
         values[index]=obj;
        return (E) values;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<E>(values);
    }
}
