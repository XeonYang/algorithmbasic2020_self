package class03;

public class C02_DeleteGivenValue {

    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }

        public static Node removeValue(Node head, int num) {
            // head来到第一个不需要删的位置
            while (head != null) {
                if (head.next != null) {
                    if (head.value != num) {
                        break;
                    }
                    head = head.next;
                }
            }
            // 因为遇到要删除的节点时，需要跳过它。所以要准备两个节点
            Node pre = head;
            Node cur = head;
            while (cur != null) {
                // 删除动作是在备用节点做的
                if (cur.value == num) {
                    // 当前节点要删除了，则备用节点跨过这个节点
                    pre.next = cur.next;
                } else {
                    // 否则不需要删除，备用节点和当前节点保持一致
                    pre = cur;
                }
                // 当前节点继续移动
                cur = cur.next;
            }
            // 删除了所需节点后返回head
            return head;
        }
    }
}