package com.data.list;


import com.data.tree.mBinaryTree;
import com.data.tree.mNaryTree;

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

        mBinaryTree bt = new mBinaryTree();
        bt.add(1);
        bt.add(2);
        bt.add(0);
        bt.add(4);
        //System.out.print(String.valueOf(bt.remove(1)));
        //System.out.print(String.valueOf(bt.contains(1)));
       // System.out.print(String.valueOf(bt.height()));
        //bt.print();

        mNaryTree nAry = new mNaryTree("matter",3);
        nAry.add("pure");
        nAry.getLeaf(0).add("elements");
        nAry.getLeaf(0).getLeaf(0).add("metals");
        nAry.getLeaf(0).getLeaf(0).add("metal2");
        nAry.getLeaf(0).getLeaf(0).add("metal3");
        nAry.getLeaf(0).add("compunents");
        nAry.getLeaf(0).getLeaf(1).add("water");
        nAry.getLeaf(0).getLeaf(1).add("carbon");
        nAry.getLeaf(0).getLeaf(1).add("salt");
        nAry.add("mixture");
        nAry.getLeaf(1).add("homo");
        nAry.getLeaf(1).getLeaf(0).add("metals");
        nAry.getLeaf(1).getLeaf(0).add("metal2");
        nAry.getLeaf(1).add("hetro");
        nAry.getLeaf(1).getLeaf(1).add("colloid");
        nAry.getLeaf(1).getLeaf(1).add("suspension");
        nAry.print();
    }

}
