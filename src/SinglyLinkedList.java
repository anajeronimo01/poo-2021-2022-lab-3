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
        for(int i = 0; i < position; i++) {
            node = node.getNext();
        }
        return node.getElement();
    }

    public void insertFirst(Object element) {
        SingleListNode newNode = new SingleListNode(element, this.head);
        this.head = newNode;
        this.numElements++;
        if(numElements == 1) {
            this.tail = this.head;
        }
    }

    public void insertLast(Object element) {
        SingleListNode newNode = new SingleListNode(element, null);
        if(head == tail) {
            head = newNode;
        }
        if(tail != null) {
            tail.setNext(newNode);
        }
        tail = newNode;
        numElements++;
    }

    public void insert(Object element, int position) {
        if(position == 0) {
            insertFirst(element);
        } else if(position == numElements - 1) {
            insertLast(element);
        } else {
            SingleListNode previousNode = this.head;
            for(int i = 0; i < position - 1; i++) {
                previousNode = previousNode.getNext();
            }
            SingleListNode newNode = new SingleListNode(element, previousNode.getNext());
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
        for(int i = -1; i < numElements - 1; i++) {
            previousNode = previousNode.getNext();
        }
        previousNode.setNext(null);
        tail = previousNode;
        numElements--;
        return element;
    }

    public Object remove(int position) {
        if(position == 0) {
            return removeFirst();
        } else if(position == numElements - 1) {
            return removeLast();
        } else {
            SingleListNode previousNode = head;
            for(int i = 0; i < position - 1; i++) {
                previousNode = previousNode.getNext();
            }
            Object element = previousNode.getNext().getElement();
            previousNode.setNext(previousNode.getNext().getNext());
            numElements--;
            return element;
        }
    }
}
