public class SinglyLinkedList {
    private SingleListNode head;
    private SingleListNode tail;
    private int numElements;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.numElements = 0;
    }

    public Object getFirst() {
        return this.head.getElement();
    }
    
    public Object getLast() {
        return this.tail.getElement();
    }

    public Object get(int position) {
        SingleListNode node = this.head;
        for(int i=0; i<position; i++) {
            node = node.getNext();
        }
        return node.getElement();
    }

    public void insertFirst(Object element) {

    }

    public void insertLast(Object element) {

    }

    public void insert(Object element, int position) {

    }

    public Object removeFirst() {
        return null;
    }

    public Object removeLast() {

        return null;
    }

    public Object remove(int position) {
        return null;

    }
}
