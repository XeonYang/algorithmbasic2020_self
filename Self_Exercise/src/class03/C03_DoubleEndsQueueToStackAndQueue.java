package class03;

public class C03_DoubleEndsQueueToStackAndQueue {
    // 一个泛型的双端链表节点
    public static class Node<T> {
        public T value;
        public Node<T> last;
        public Node<T> next;

        public Node(T data) {
            value = data;
        }
    }

    // 实现一个双端链表
    public static class DoubleEndsQueue<T> {
        public Node<T> head;
        public Node<T> tail;

        // 从头部加节点
        public void addFromHead(T value) {
            Node<T> cur = new Node<T>(value);

            if (head == null) {
                // 队列为空时
                head = cur;
                tail = cur;
            } else {
                // 否则，先把原来、未来的头节点的信息更新了，再移动头
                cur.next = head;
                head.last = cur;
                head = cur;
            }
        }

        // 从尾部加节点
        public void addFromBottom(T value) {
            Node<T> cur = new Node<T>(value);

            if (head == null) {
                // 队列为空时
                head = cur;
                tail = cur;
            } else {
                cur.last = tail;
                tail.next = cur;
                tail = cur;
            }
        }

        // 从头部弹出。记得更新要弹出节点的next
        public T popFromHead() {
            if (head == null) {
                return null;
            }
            // 先记录要弹出的节点
            Node<T> cur = head;
            if (head == tail) {
                // 弹完队列为空。则cur.next也一定为null
                head = null;
                tail = null;
            } else {
                // 否则既更新Head。也要更新cur.next
                head = head.next;
                head.last = null;
                cur.next = null;
            }
            return cur.value;
        }

        // 从尾部弹出。记得更新要弹出节点的last
        public T popFromBottom() {
            if (head == null) {
                return null;
            }
            Node<T> cur = tail;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail = tail.last;
                tail.next = null;
                cur.last = null;
            }
            return cur.value;
        }

        public boolean isEmpty() {
            return head == null;
        }
    }

    public static class MyStack<T> {
        private DoubleEndsQueue<T> queue;

        // 初始化时，栈里就是一个空的双端队列
        public MyStack() {
            queue = new DoubleEndsQueue<T>();
        }

        // 压入操作
        public void push(T value) {
            queue.addFromHead(value);
        }

        // 弹出操作
        public T pop() {
            return queue.popFromHead();
        }

        // 空
        public boolean isEmpty() {
            return queue.isEmpty();
        }
    }

    public static class MyQueue<T> {
        private DoubleEndsQueue<T> queue;

        public MyQueue() {
            queue = new DoubleEndsQueue<T>();
        }

        public void push(T value) {
            queue.addFromHead(value);
        }

        public T poll() {
            return queue.popFromBottom();
        }
        public boolean isEmpty() {return queue.isEmpty();}
    }
}

























