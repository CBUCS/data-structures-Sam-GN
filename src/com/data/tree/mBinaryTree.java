package com.data.tree;

public class mBinaryTree<T> implements TreeInterface<T> {
//Technically this is a binary search tree. But still a binary search tree is kind of a binary tree.
    private binaryTreeNode<T> root;

    //to add new items to the tree
    @Override
    public boolean add(T pItem) {
        this.root = insertion(this.root,pItem);
        return true;
    }
    //removes item from the tree if available
    @Override
    public boolean remove(T pItem) {
        if(contains(pItem)) {
            deleteNode(this.root, pItem);
            return true;
        }
        else
            return false;
    }

    //searches the tree for specific item
    @Override
    public boolean contains(T pItem) {
        return searchTree(this.root,pItem);
    }

    //returns the number of items in the tree
    @Override
    public int numItems() {
        return count(this.root);
    }
    //returns the height of the tree
    @Override
    public int height() {
        return calculateHeight(this.root);
    }
    //prints all the items in the tree
    @Override
    public void print() {
        System.out.print("Model : Root(Left Leaf,Right Leaf)"+"\n");
        System.out.print(whatToPrint(this.root));
    }

    //when adding new items this method is called to decide where to add the new item
    private binaryTreeNode<T> insertion (binaryTreeNode<T> pCurrent, T pItem){
        //when node is empty
        if(pCurrent==null)
            return new binaryTreeNode<T>(pItem);
        //decides where to put the value based on node's current value
        else if((Integer)pCurrent.getItem()>(Integer) pItem)
            pCurrent.setLeft(insertion(pCurrent.getLeft(),pItem));
        else if ((Integer)pCurrent.getItem()<(Integer) pItem)
            pCurrent.setRight(insertion(pCurrent.getRight(),pItem));
        return pCurrent;
    }

    //when removing item from tree, this method is called to decide if tree needs to be rearranged
    private binaryTreeNode<T> deleteNode (binaryTreeNode<T> pCurrent, T pItem){
        //when node is empty
        if(pCurrent==null)
            return null;
        //item to be deleted is found
        if(pCurrent.getItem()==pItem){
            //if there are no children for this node
            if(pCurrent.getLeft()==null&&pCurrent.getRight()==null)
                return null;
            //if only left has a child
            if(pCurrent.getRight()==null)
                return pCurrent.getLeft();
            //if only right has a child
            if(pCurrent.getLeft()==null)
                return pCurrent.getRight();
            //when both sides has a child, finds the smallest item from its right side to replace it with
            T smallestItem = findSmallestItem(pCurrent.getRight());
            pCurrent.setItem(smallestItem);
            pCurrent.setRight(deleteNode(pCurrent.getRight(),smallestItem));
            return pCurrent;
            //continue looking for the item based on current node's value
        } else if((Integer)pCurrent.getItem()>(Integer)pItem)
            pCurrent.setLeft(deleteNode(pCurrent.getLeft(),pItem));
        else if ((Integer)pCurrent.getItem() < (Integer)pItem)
            pCurrent.setRight(deleteNode(pCurrent.getRight(),pItem));
        return pCurrent;
    }

    //finds smallest value from any given node
    private T findSmallestItem (binaryTreeNode<T> pNode){
        if(pNode.getLeft()==null)
            return pNode.getItem();
        else
            return findSmallestItem(pNode.getLeft());
    }

    //searches the tree for item
    private boolean searchTree (binaryTreeNode<T> pCurrent, T pItem){
        if(pCurrent==null)
            return false;
        else if(pCurrent.getItem()==pItem)
            return true;
        else{
            if((Integer)pCurrent.getItem()>(Integer) pItem)
                return searchTree(pCurrent.getLeft(),pItem);
            else
                return searchTree(pCurrent.getRight(),pItem);
        }
    }
    //counts the number of nodes
    private int count (binaryTreeNode<T> pCurrent) {
        if(pCurrent==null)
            return 0;
        else{
            int count = 1;
            count += count(pCurrent.getLeft());
            count += count(pCurrent.getRight());
            return count;
        }
    }
    //calculates the height of the tree
    private int calculateHeight(binaryTreeNode<T> pCurrent){
        if(pCurrent==null)
            return 0;
        else{
            int left = calculateHeight(pCurrent.getLeft());
            int right = calculateHeight(pCurrent.getRight());
            return Math.max(left, right) + 1;

        }
    }
    //algorithm to print tree in meaningful order
    private String whatToPrint(binaryTreeNode<T> pCurrent){
        if(pCurrent==null)
            return "Null";
        else{
            return String.valueOf(pCurrent.getItem())+"("+whatToPrint(pCurrent.getLeft())+","+whatToPrint(pCurrent.getRight())+")";
        }
    }
}
