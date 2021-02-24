package task7.myarraylist.classes;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator {

    private int index = 0;
    E[] values;

    ArrayIterator(E[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
