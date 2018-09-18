package com.data.data;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        mLinkedList mList = new mLinkedList();
        mList.add(1);
        mList.add(2);
        mList.add(3);
       mList.addAt(0,3);
      //  mList.removeAt(0);
       // mList.contains(1);
      // mList.print();
       // System.out.print(String.valueOf(mList.numItems()));
        //System.out.print(String.valueOf( mList.grabAt(4)) );

       mStack stack = new mStack();
       stack.add(1);
       stack.add(2);
       stack.add(3);
       stack.add(4);
       stack.pop();
      // stack.print();
      // System.out.print(String.valueOf(stack.numItems()));
      // System.out.print(String.valueOf(stack.pop()));


        mQueue Q = new mQueue();
        Q.add(1);
        Q.add(2);
        Q.add(3);

       //Q.dequeue();
     //Q.print();

        mDequeue dq = new mDequeue();
        dq .addFromTail(1);
        dq.addFromTail(2);
        dq.addFromTail(3);
        dq.addFromHead(0);
        dq.addFromTail(4);
        dq.dequeueFromHead();
        dq.dequeueFromTail();
        dq.clear();
       // dq.print();
        //System.out.print(String.valueOf(dq.numItems()));

        mSet set = new mSet();
        mSet set2 = new mSet();
        //set.add(6);
        set.add(0);
        set.add(1);
        set.add(2);
        set2.add(2);
        set2.add(3);
        set2.add(4);
       /// set.add(5);
       // set.add(11);

        //mSet set3 = set.union(set2);
       // mSet set3 = set.intersection(set2);
        mSet set3 = set.difference(set2);
       // set3.print();
       //System.out.print(String.valueOf(set.contains(2)));

    }

}
