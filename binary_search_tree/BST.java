package binary_search_tree;

import sun.reflect.generics.tree.Tree;

import javax.swing.*;
import javax.swing.tree.TreeNode;

/**
 * @Author: echo Zhao
 * @Descciption:
 * @Date: Created in 20:19 2020/11/1 0001
 * @Modified By:
 */
public class BST {
    public Node root;

    public BST(){
        root = null;
    }

    public boolean search (Integer key){
        Node current = root ;

        while (current != null){
            int cmp = key.compareTo(current.val);

            if (cmp == 0){
                return true;
            }else if(cmp < 0){
                current = current.left;
            }else current = current.right;
        }

        return false;
    }

    public void insert(Integer key) throws Exception {
        if (root == null){
            root = new Node(key);
            return;
        }
        Node parent = null;
        Node current = root;
        int cmp = 5;
        while (current != null){
            cmp = key.compareTo(current.val);

            if (cmp == 0){
                throw new Exception("搜索树中元素重复");
            }else if (cmp < 0 ){
                parent = current;
                current = current.left;
            }else {
                parent = current;
                current = current.right;
            }
        }

        Node node = new Node(key);
        if (cmp < 0 ){
            parent.left = node;
        }else parent.right = node;
    }


}
