package class03;

public class C01_ReverseList {
    public static class Node {
        public int value;
        public Node next;
        public Node(int data) {
            this.value = data;
        }
    }

    public static class DoubleNode {
        public int value;
        public DoubleNode last;
        public DoubleNode next;
        public DoubleNode(int data) {
            value = data;
        }
    }

    public static Node reverseLinkedList(Node head) {
        // 反转时一定需要记录当前、下一个位置
        Node pre = null;
        Node next = null;
        // [Always]移动头节点的常见操作
        while (head != null) {
            // 记录下一个移动位置
            next = head.next;
            // 操作反转
            head.next = pre;
            pre = head;
            // 移动head
            head = next;
        }
        return pre;
    }

    public static DoubleNode reverDoubleList(DoubleNode head) {
        DoubleNode pre = null;
        DoubleNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }
        return pre;
    }
}





















