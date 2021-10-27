public class SinglyLinkedList {
    private SingleListNode head;
    private SingleListNode tail;
    private int numElements;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        numElements = 0;
    }

    public Object getFirst() {
        return this.head.getElement();
    }

    public Object getLast() {
        return this.tail.getElement();
    }

    public Object get(int position) {
        SingleListNode node = head;
        for(int i=0; i<position; i++) {
            node = node.getNext();
        }
        return node.getElement();
    }

    public void insertFirst(Object element) {}
    public void insertLast(Object element) {}

    public void insert(Object element, int position) {}

    public Object removeFirst() {}
    public Object removeLast() {}

    public Object remove(int position) {}
}
