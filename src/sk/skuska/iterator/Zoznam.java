package sk.skuska.iterator;

import java.util.LinkedList;

public class Zoznam<T> extends LinkedList<T> implements Aggregate<T> {
    @Override
    public Iterator<T> createIterator() {
        return new ZoznamIterator<T>(this);
    }
}
