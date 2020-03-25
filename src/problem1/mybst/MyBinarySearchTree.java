/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    TreeNode root;

    MyBinarySearchTree(){
        root = null;
    }

    public void insert(int data){
        TreeNode ns = new TreeNode();
        ns.setdata(data);
        if(root == null){
            root = ns;
        }
        else{
            TreeNode current = root;
            TreeNode previous = null;
            while(true){
                previous = current;
                if(data > current.getdata()){
                    if(current.getRight()==null){
                        current.setRight(ns);
                        break;
                    }
                    else{
                        current = current.getRight();
                    }
                }
                else{
                    if(current.getLeft()==null){
                        current.setLeft(ns);
                        break;
                    }
                    else{
                        current = current.getLeft();
                    }
                }
            }
        }
    }
}
