package org.example.datastrucures;

public class Tree {
    private TreeNode root;
    public void insert(int value){
        if(root ==null){
            root = new TreeNode(value);
        }
        else{
            root.insert(value);
        }
    }
    public TreeNode delete(TreeNode subtree, int value){
        if(subtree == null){
            return subtree;
        }
        if(value < subtree.getData()){
            subtree.setLeftChild(delete(subtree.getLeftChild(),value));
        }
        else if(value < subtree.getData()){
            subtree.setRightChild(delete(subtree.getRightChild(),value));
        }

        return subtree;
    }

    public TreeNode get(int value){
        if(root !=null){
            return root.get(value);
        }
        return null;
    }
public void printDataInOrder(){
        if(root!=null){
            root.traverseInOrder();
        }
}
public int max(){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        else{
            return root.max();
        }
}
}
