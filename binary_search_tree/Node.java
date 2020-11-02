package binary_search_tree;

/**
 * @Author: echo Zhao
 * @Descciption:
 * @Date: Created in 20:18 2020/11/1 0001
 * @Modified By:
 */
public class Node {
    Integer val;
    Node left;
    Node right;

    Node(Integer key){
        this.val = key;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                '}';
    }
}
