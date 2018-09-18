package com.data.data;

public class mSet implements ListInterface{
    private mLinkedList set;

    public mSet (){
        set = new mLinkedList();
    }


    @Override
    public boolean add(Object item) {
        if(!set.contains(item)) {
            set.add(item);
            return true;
        }
        else
            return false;
    }


    @Override
    public boolean remove(Object item) {
        return set.remove(item);
    }


    @Override
    public boolean contains(Object item) {
        return set.contains(item);
    }

    @Override
    public int numItems() {
        return set.numItems();
    }


    @Override
    public Object[] toArray() {
        return set.toArray();
    }

    @Override
    public void print() {
        set.print();
    }
    @Override
    public boolean clear(){
       set = new mLinkedList();
        return true;
    }

    public mSet union (mSet set1, mSet set2 ){

       for (int i=0; i<set2.numItems();i++){
           if(!set1.contains(set2.grabAt(i)));
                set1.add(set2.grabAt(i));
       }
            return set1;
    }

    @Override
    public Object grabAt(int position) { return null; }

    @Override
    public boolean removeAt(int position) { return false; }

    @Override
    public boolean addAt(Object item, int position) { return false; }
}
