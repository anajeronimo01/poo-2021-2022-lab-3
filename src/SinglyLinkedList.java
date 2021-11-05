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
        var node = this.head;
        for(int i = 0; i < position; i++) {
            node = node.getNext();
        }
        return node.getElement();
    }

    public void insertFirst(Object element) {
        SingleListNode singleListNode = new SingleListNode(element, this.head);
        this.head = singleListNode;
        this.numElements++;
        if(numElements == 1) {
            tail = head;
        }
    }

    public void insertLast(Object element) {
        SingleListNode newNode = new SingleListNode(element, null);
        if(numElements == 0) {
            tail = newNode;
            head = newNode;
        }
        else {
            tail.setNext(newNode);
        }
        numElements++;
    }

    public void insert(Object element, int position) {
        if(position == 0) {
            insertFirst(element);
        }
        else if(position == numElements-1) {
            insertLast(element);
        }
        else {
            SingleListNode previousNode = head;
            for(int i=0; i<position-1; i++) {
                previousNode = previousNode.getNext();
            }
            SingleListNode newNode =
                    new SingleListNode(element, previousNode.getNext());
            previousNode.setNext(newNode);
            numElements++;
        }
    }

    public Object removeFirst() {
        Object element = head.getElement();
        head = head.getNext();
        numElements--;
        return element;
    }

    public Object removeLast() {
        Object element = tail.getElement();
        SingleListNode previousNode = head;
        for(int i=0; i<numElements-2; i++) {
            previousNode = previousNode.getNext();
        }
        previousNode.setNext(null);
        tail = previousNode;
        numElements--;
        if(numElements == 0) {
            head = null;
            tail = null;
        }
        return element;
    }

    public Object remove(int position) {
        if(position == 0) {
            return removeFirst();
        }
        else if(position == numElements-1) {
            return removeLast();
        }
        else {
            SingleListNode previousNode = head;
            for(int i=0; i<position-1; i++) {
                previousNode = previousNode.getNext();
            }
            SingleListNode target = previousNode.getNext();
            Object element = target.getElement();
            previousNode.setNext(target.getNext());
            return element;
        }
    }
}
