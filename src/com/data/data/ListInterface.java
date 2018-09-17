package com.data.data;

public interface ListInterface {
    boolean add (Object item);
    boolean addAt (Object item, int position);
    boolean remove (Object item);
    boolean removeAt (int position);
    boolean contains (Object item);
    int numItems();
    Object grab();
    Object[] toArray();
    void print();
}
