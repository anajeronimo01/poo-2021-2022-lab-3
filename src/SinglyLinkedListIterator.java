public class SinglyLinkedListIterator {
    private SingleListNode head;
    private SingleListNode next;

    public SinglyLinkedListIterator(final SingleListNode head) {
        this.head = head;
        this.next = head;
    }

    public boolean hasNext() {
        return next != null;
    }

    public Object next() {
        Object element = next.getElement();
        next = next.getNext();
        return element;
    }

    public void rewind() {
        next = head;
    }

}
