package com.data.list;

public interface ListInterface {
    boolean add (Object item);
    boolean addAt (Object item, int position);
    boolean remove (Object item);
    boolean removeAt (int position);
    boolean contains (Object item);
    int numItems();
    Object grabAt(int position);
    Object[] toArray();
    void print();
    boolean clear();
}
