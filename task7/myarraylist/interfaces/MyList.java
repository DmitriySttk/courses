package task7.myarraylist.interfaces;

public interface MyList<E> extends Iterable<E>{
    void add(int index, E obj);
    E get(int index);
    int size();
    E set(int index, E obj);
}
