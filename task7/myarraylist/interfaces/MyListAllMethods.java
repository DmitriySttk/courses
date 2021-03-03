package task7.myarraylist.interfaces;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public interface MyListAllMethods<E> extends Collection<E> {

  //  void add(int index, E obj);
    // добавляет в список по индексу index объект obj

    boolean addAll(int index, Collection<? extends E> col);
    // добавляет в список по индексу index все элементы коллекции col. Если в результате добавления список был изменен,
    // то возвращается true, иначе возвращается false

 //   E get(int index);
    // возвращает объект из списка по индексу index

 //  int indexOf(Object obj);
    // возвращает индекс первого вхождения объекта obj в список. Если объект не найден, то возвращается -1

  //  int lastIndexOf(Object obj);
    // возвращает индекс последнего вхождения объекта obj в список. Если объект не найден, но возвращается -1

    ListIterator<E> listIterator();
    // возвращает ListIterator для обхода элементов списка

    static <E> List<E> of(E e1, E e2) {
        return null;
    }
    // создает из набора элементов объект List

//    E remove(int index);
    // удаляет объект из списка по индексу index, возвращая при этом удаленный объект

 //   E set(int index, E obj);
    // присваивает значение объекта obj элементу, который находится по индексу index

    void sort(Comparator<? super E> comp);
    // сортирует список с помощью компаратора comp методом пузырька

    List<E> subList(int start, int end);//получает набор элементов, которые находятся в списке между индексами start и end



}
