package myhash_table;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * @Author: echo Zhao
 * @Descciption:
 * @Date: Created in 19:42 2020/11/3 0003
 * @Modified By:
 */
public class Myhashtable {
    // 1. 数组
    private Node[] array = new Node[11];
    // 2. 维护哈希表中的有的元素个数
    private int size;

    // true: key 之前不在哈希表中
    // false: key 之前已经在哈希表中
    public boolean insert(Integer key) {
        // 1. 把对象转成 int 类型
        // hashCode() 方法的调用是核心
        int hashValue = key.hashCode();
        // 2. 把 hashValue 转成合法的下标
        int index = hashValue % array.length;
        // 3. 遍历 index 位置处的链表，确定 key 在不在元素中
        Node current = array[index];
        while (current != null) {
            // equals() 方法的调用是核心
            if (key.equals(current.key)) {
                return false;
            }
            current = current.next;
        }
        // 4. 把 key 装入节点中，并插入到对应的链表中
        // 头插尾插都可以，头插相对简单
        Node node = new Node(key);
        node.next = array[index];
        array[index] = node;

        // 5. 维护 元素个数
        size++;

        return true;
    }

    public boolean remove (Integer key){
        int hashValue = key.hashCode();
        int index = hashValue % array.length;
        Node cur = array[index];
        Node pre = null;
        while (cur != null){
            if (key.equals(cur.key)){
                if (pre == null){
                    array[index] = null;
                }else {
                    pre.next = cur.next;
                }
                size--;
                return true;
            }
            pre = cur;
            cur = cur.next;
        }

        return false;
    }

    public boolean contains(Integer key){
        int hashValue = key.hashCode();
        int index = hashValue % array.length;

        Node cur = array[index];
        while (cur != null) {
            if (key.equals(cur.key)) {
                return true;
            }

            cur = cur.next;
        }

        return false;
    }
}
