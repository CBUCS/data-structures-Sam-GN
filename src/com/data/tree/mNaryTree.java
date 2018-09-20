package com.data.tree;

import com.data.list.mLinkedList;

public class mNaryTree implements TreeInterface {
   // nAryTreeNode root;
    int MAXSIZE;
    mLinkedList leaves;
    Object item;

    public mNaryTree(Object pItem,int pMAXSIZE){
        MAXSIZE = pMAXSIZE;
        leaves = new mLinkedList();
        item = pItem;

    }
    @Override
    public boolean add(Object item) {
        return addLeaf(new mNaryTree(item,MAXSIZE));
    }

    @Override
    public boolean remove(Object item) {
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
    public int height() {
        return 0;
    }

    @Override
    public void print() {
        printing(this,0);

    }
    private void printing (mNaryTree n,int depth){
        for (int i=0;i<depth;i++){
            System.out.print("    ");
        }
        System.out.print(String.valueOf(n.item));
        for(int j=0;j<leaves.numItems();j++){
            printing((mNaryTree) leaves.grabAt(j),depth+1);
        }
    }
    public mNaryTree getLeaf (int i){
        if(i<leaves.numItems())
            return (mNaryTree) leaves.grabAt(i);
        else
            return null;
    }
    private boolean addLeaf(mNaryTree n){
       if(leaves.numItems()<MAXSIZE){
           leaves.add(n);
           return true;
       }

        return false;
    }

}
