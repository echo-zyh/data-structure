package binary_search_tree;

import java.util.Arrays;

/**
 * @Author: echo Zhao
 * @Descciption:
 * @Date: Created in 20:58 2020/11/1 0001
 * @Modified By:
 */
public class Testdemo {
    public static void main(String[] args) throws Exception {
        BST bst = new BST();

        bst.insert(6);
        bst.insert(8);
        bst.insert(5);
        bst.insert(4);
        bst.insert(6);
        
        System.out.println(bst);

        System.out.println(bst.search(8));
        System.out.println(bst.search(9));

    }
}
