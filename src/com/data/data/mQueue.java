/*
package com.data.data;

public class mQueue implements ListInterface {

    private int maxSize;
    private int head;
    private int tail;
    private Object mArray [];

    public mQueue (int n){
       maxSize = n;
       mArray = new Object[maxSize];
       head = 0;
       tail = 0;
    }

    @Override
    public boolean add(Object item) {
        if(tail<maxSize){
            mArray [tail] = item;
            tail++;
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean remove(Object item) {
        if(tail>0) {
            mArray[head] = null;
            head++;
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object item) {
        return false;
    }

    @Override
    public int numItems() {
        return 0;
    }

    @Override
    public Object grab() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }
}
*/
