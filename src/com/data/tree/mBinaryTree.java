package com.data.tree;

public class mBinaryTree implements TreeInterface {
//Technically this is a binary search tree. But still a binary search tree is kind of a binary tree.
    private binaryTreeNode root;

    //to add new items to the tree
    @Override
    public boolean add(Object pItem) {
        root = insertion(root,pItem);
        return true;
    }
    //removes item from the tree if available
    @Override
    public boolean remove(Object pItem) {
        if(contains(pItem)) {
            deleteNode(root, pItem);
            return true;
        }
        else
            return false;
    }

    //searches the tree for specific item
    @Override
    public boolean contains(Object pItem) {
        return searchTree(root,pItem);
    }

    //returns the number of items in the tree
    @Override
    public int numItems() {
        return count(root);
    }
    //returns the height of the tree
    @Override
    public int height() {
        return calculateHeight(root);
    }
    //prints all the items in the tree
    @Override
    public void print() {
        System.out.print("Model : Root(Left Leaf,Right Leaf)"+"\n");
        System.out.print(whatToPrint(root));
    }

    //when adding new items this method is called to decide where to add the new item
    private binaryTreeNode insertion (binaryTreeNode pCurrent, Object pItem){
        //when node is empty
        if(pCurrent==null)
            return new binaryTreeNode(pItem);
        //decides where to put the value based on node's current value
        else if((Integer)pCurrent.item>(Integer) pItem)
            pCurrent.left = insertion(pCurrent.left,pItem);
        else if ((Integer)pCurrent.item<(Integer) pItem)
            pCurrent.right = insertion(pCurrent.right,pItem);
        return pCurrent;
    }

    //when removing item from tree, this method is called to decide if tree needs to be rearranged
    private binaryTreeNode deleteNode (binaryTreeNode pCurrent, Object pItem){
        //when node is empty
        if(pCurrent==null)
            return null;
        //item to be deleted is found
        if(pCurrent.item==pItem){
            //if there are no children for this node
            if(pCurrent.left==null&&pCurrent.right==null)
                return null;
            //if only left has a child
            if(pCurrent.right==null)
                return pCurrent.left;
            //if only right has a child
            if(pCurrent.left==null)
                return pCurrent.right;
            //when both sides has a child, finds the smallest item from its right side to replace it with
            Object smallestItem = findSmallestItem(pCurrent.right);
            pCurrent.item = smallestItem;
            pCurrent.right = deleteNode(pCurrent.right,smallestItem);
            return pCurrent;
            //continue looking for the item based on current node's value
        } else if((Integer)pCurrent.item>(Integer)pItem)
            pCurrent.left = deleteNode(pCurrent.left,pItem);
        else if ((Integer)pCurrent.item > (Integer)pItem)
            pCurrent.right = deleteNode(pCurrent.right,pItem);
        return pCurrent;
    }

    //finds smallest value from any given node
    private Object findSmallestItem (binaryTreeNode pNode){
        if(pNode.left==null)
            return pNode.item;
        else
            return findSmallestItem(pNode.left);
    }

    //searches the tree for item
    private boolean searchTree (binaryTreeNode pCurrent, Object pItem){
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
    //counts the number of nodes
    private int count (binaryTreeNode pCurrent) {
        if(pCurrent==null)
            return 0;
        else{
            int count = 1;
            count += count(pCurrent.left);
            count += count(pCurrent.right);
            return count;
        }
    }
    //calculates the height of the tree
    private int calculateHeight(binaryTreeNode pCurrent){
        if(pCurrent==null)
            return 0;
        else{
            int left = calculateHeight(pCurrent.left);
            int right = calculateHeight(pCurrent.right);
            return Math.max(left, right) + 1;

        }
    }
    //algorithm to print tree in meaningful order
    private String whatToPrint(binaryTreeNode pCurrent){
        if(pCurrent==null)
            return "Null";
        else{
            return String.valueOf(pCurrent.item)+"("+whatToPrint(pCurrent.left)+","+whatToPrint(pCurrent.right)+")";
        }
    }
}
