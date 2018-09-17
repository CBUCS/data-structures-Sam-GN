package com.data.data;

import java.util.Arrays;

public class mStack implements ListInterface {

   // private int maxSize;
    private int top;
    //private Object mArray [];
    private mLinkedList stack;

    public mStack (){
        //maxSize = n;
       // mArray = new Object[maxSize];
        top = 0;
        stack = new mLinkedList();
    }

    @Override
    public boolean add(Object item) {
    /*    if(top<maxSize) {
            mArray[top] = item;
            top++;
            return true;
        }
        else{
            return false;
        }*/
        stack.add(item);
        top++;

        return true;
    }

    @Override
    public boolean addAt(Object item, int position) {

        return true;
    }


    @Override
    public boolean remove(Object item) {
        /*if(top!=0) {
            mArray[top - 1] = null;
            top--;
            return true;
        }
        else*/
            return false;
    }

    public boolean removeLast (){
        if(stack.numItems()!=0){
            stack.removeAt(numItems());
            return true;
        }
        else
             return false;
    }


    @Override
    public boolean removeAt(int position) {

        return true;
    }


    @Override
    public boolean contains(Object item) {
       /* if(top!=0)
             for (Object o:mArray)
                if(o==item)
                    return true;*/
        return stack.contains(item);
    }

    @Override
    public int numItems() {
        return stack.numItems();
    }

    @Override
    public Object grab() {
        /*if(top!=0)
            return mArray[top-1];
        else*/
            return stack.grab();
    }

    @Override
    public Object[] toArray() {
        return stack.toArray();
    }

    @Override
    public void print() {
        System.out.print(Arrays.toString(toArray()));

    }
}
