package com.data.list;

public interface ListInterface <T> {
    boolean add (T item);
    boolean addAt (T item, int position);
    boolean remove (T item);
    boolean removeAt (int position);
    boolean contains (T item);
    int numItems();
    T grabAt(int position);
    T[] toArray();
    void print();
    boolean clear();
}
