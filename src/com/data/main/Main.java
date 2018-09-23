package com.data.main;


import com.data.list.*;
import com.data.tree.mBinaryTree;
import com.data.tree.mNaryTree;
import com.data.tree.nAryTreeNode;

//this is my main class. I only used it to test my implementations
public class Main {
    public static void main(String[] args){

        mLinkedList<Integer> mList = new mLinkedList<Integer>();
        mList.add(1);
        mList.add(2);
        mList.add(3);
       mList.addAt(0,3);
        mList.addAt(7,7);
        mList.removeAt(0);
        mList.contains(1);
     // mList.print();
       // System.out.print(String.valueOf(mList.numItems()));
       // System.out.print(String.valueOf( mList.grabAt(2)) );

       mStack<Integer> stack = new mStack<Integer>();
       stack.add(1);
       stack.add(2);
       stack.add(3);
       stack.add(4);
       stack.pop();
      // stack.print();
      // System.out.print(String.valueOf(stack.numItems()));
       //System.out.print(String.valueOf(stack.pop()));


        mQueue<Integer> Q = new mQueue<Integer>();
        Q.add(1);
        Q.add(2);
        Q.add(3);

      // Q.dequeue();
     //Q.print();

        mDequeue<Integer> dq = new mDequeue<Integer>();
        dq .addFromTail(1);
        dq.addFromTail(2);
        dq.addFromTail(3);
        dq.addFromHead(0);
        dq.addFromTail(4);
        dq.dequeueFromHead();
        dq.dequeueFromTail();
       // dq.clear();
       // dq.print();
        //System.out.print(String.valueOf(dq.numItems()));

        mSet<Integer> set = new mSet<Integer>();
        mSet<Integer> set2 = new mSet<Integer>();
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
       //mSet set3 = set.intersection(set2);
        //mSet set3 = set.difference(set2);
        //set3.print();
       //System.out.print(String.valueOf(set.contains(2)));

        mBinaryTree<Integer> bt = new mBinaryTree<Integer>();
        bt.add(3);
        bt.add(1);
        bt.add(2);
        bt.add(6);
        bt.add(0);
        bt.add(4);
        bt.add(5);
        bt.add(0);
        System.out.print(String.valueOf(bt.remove(1)));
        //System.out.print(String.valueOf(bt.contains(1)));
       // System.out.print(String.valueOf(bt.height()));
        bt.print();
        mNaryTree tree = new mNaryTree(3);
        nAryTreeNode a = new nAryTreeNode("a",3);
        nAryTreeNode b = new nAryTreeNode("b",3);
        nAryTreeNode c = new nAryTreeNode("c",3);
       tree.addRoot("root");
       tree.getRoot().addchild(a,0);
       a.addchild(b,0);
        tree.getRoot().addchild(c,1);


        //System.out.print(String.valueOf(tree.contains("b")));

       // tree.print();
    }

}
