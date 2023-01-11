package sk.skuska.iterator;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
