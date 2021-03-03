package task7.myarraylist.classes;


import task7.myarraylist.interfaces.MyList;

import java.util.Iterator;
import java.util.List;

public class MyArrayList<E> implements MyList<E> {

    private E[] values;

    MyArrayList() {
        values = (E[]) new Object[0];
    }

    MyArrayList(int capacity) {
        values = (E[]) new Object[capacity];
    }


    @Override
    public void add(int index, E obj) {
        E[] temp = values;
        if (index > temp.length) {
            values = (E[]) new Object[index + 1];
            for (int i = 0; i < temp.length; i++) {  //копирование существующего массива в темп
                values[i] = temp[i];
            }
            values[index] = obj;
        } else {
            values[index] = obj;
        }

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
        values[index] = obj;
        return (E) values;
    }

    @Override
    public int indexOf(Object obj) {
        int index;
        for (int i = 0; i < values.length; i++) {
            if (obj.equals(values[i])) {
                index = i;
                return index;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object obj) {
        int index = -1;
        for (int i = 0; i < values.length; i++) {
            if (obj.equals(values[i])) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public E remove(int index) {
        E temp = null;
        temp = values[index];
        values[index] = null;
        return temp;
    }

    @Override
    public List<E> subList(int start, int end) {
        E[] temp = null;
        int counter=0;
        for (int i = start; i < end; i++) {
            counter++;
        }
        List<E> result = (List<E>) new MyArrayList<E>(counter);
        for (int i = start; i < end; i++) {
            result.set(i, values[i]);
        }

        return result;


    }


    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<E>(values);
    }
}
