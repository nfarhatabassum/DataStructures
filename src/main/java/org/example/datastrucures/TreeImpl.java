package org.example.datastrucures;

public class TreeImpl {
    public static void main(String[] args) {
        Tree treeData = new Tree();
        treeData.insert(25);
        treeData.insert(20);
        treeData.insert(15);
        treeData.insert(27);
        treeData.insert(30);
        System.out.println(treeData);
        System.out.println(treeData.get(3));
        treeData.printDataInOrder();
        System.out.println();
        System.out.println(treeData.max());
    }
}
