package task7.myarraylist.interfaces;

public interface MyList<E> extends Iterable<E>{
    void add(int index, E obj);
    E get(int index);
    int size();
    E set(int index, E obj);
    int indexOf(Object obj);// возвращает индекс первого вхождения объекта obj в список. Если объект не найден, то возвращается -1
    int lastIndexOf(Object obj);// возвращает индекс последнего вхождения объекта obj в список. Если объект не найден, но возвращается -1
    E remove(int index);//удаляет, возвращает объект


}

