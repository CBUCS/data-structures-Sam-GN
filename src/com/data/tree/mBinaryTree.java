package com.data.tree;

public class mBinaryTree implements TreeInterface {

    private treeNode root;


    @Override
    public boolean add(Object pItem) {
        root = insertion(root,pItem);
        return true;
    }

    @Override
    public boolean remove(Object pItem) {

        return false;
    }

    @Override
    public boolean contains(Object pItem) {

        return searchTree(root,pItem);
    }

    private treeNode insertion (treeNode pCurrent, Object pItem){
        if(pCurrent==null)
            return new treeNode(pItem);
        else if((Integer)pCurrent.item>(Integer) pItem)
            pCurrent.left = insertion(pCurrent.left,pItem);
        else if ((Integer)pCurrent.item<(Integer) pItem)
            pCurrent.right = insertion(pCurrent.right,pItem);
        else
            return pCurrent;
        return pCurrent;
    }

    private treeNode deleteNode (treeNode pCurrent,Object pItem){
        if(pCurrent==null)
            return null;
        if(pCurrent.item==pItem){

        } else if((Integer)pCurrent.item>(Integer)pItem)
            pCurrent.left = deleteNode(pCurrent.left,pItem);
        else if ((Integer)pCurrent.item > (Integer)pItem)
            pCurrent.right = deleteNode(pCurrent.right,pItem);
        return pCurrent;
    }

    private boolean searchTree (treeNode pCurrent,Object pItem){
        if(pCurrent==null)
            return false;
        else if(pCurrent.item==pItem)
            return true;
        else{
            if((Integer)pCurrent.item>(Integer) pItem)
                return searchTree(pCurrent.left,pItem);
            else
                return searchTree(pCurrent.right,pItem);
        }
    }
}
