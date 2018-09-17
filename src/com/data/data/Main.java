package com.data.data;

public class Main {
    public static void main(String[] args){

        mLinkedList mList = new mLinkedList();
        mList.add(1);
        mList.add(2);
        mList.add(3);
       mList.addAt(0,3);
        //mList.removeAt(0);
        //mList.contains(1);
        //mList.print();
       // System.out.print(String.valueOf(mList.numItems()));
        //System.out.print(String.valueOf( mList.grabAt(1)) );

       mStack stack = new mStack();
       stack.add(1);
       stack.add(2);
       stack.add(3);
       stack.pop();
       stack.print();
      // System.out.print(String.valueOf(stack.numItems()));
       //System.out.print(String.valueOf(stack.peak()));

        mQueue Q = new mQueue();
        Q.add(1);
        Q.add(2);
        Q.add(3);

       Q.dequeue();
     //  Q.print();
        //System.out.print(String.valueOf(Q.numItems()));

    }

}
