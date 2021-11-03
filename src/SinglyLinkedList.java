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
        for(int i = 0; i < position; i++) {
            node = node.getNext();
        }
        return node.getElement();
    }

    public void insertFirst(Object element) {
        SingleListNode singleListNode = new SingleListNode(element, this.head);
        this.head = singleListNode;
        this.numElements++;
    }

    public void insertLast(Object element) {
        SingleListNode singleListNode = new SingleListNode(element, null);
        this.tail.setNext(singleListNode);
        this.tail = singleListNode;
        this.numElements++;
    }

    public void insert(Object element, int position) {
        if(position == 0) {
            insertFirst(element);
        } else {
            SingleListNode previousNode = this.head;
            for(int i = 0; i < position - 1; i++) {
                previousNode = previousNode.getNext();
            }
            SingleListNode newNode = new SingleListNode(element, previousNode.getNext());
            previousNode.setNext(newNode);
            this.numElements++;
        }
    }

    public Object removeFirst() {
        Object element = this.head.getElement();
        this.head = this.head.getNext();
        this.numElements--;
        if(this.numElements == 0) {
            this.tail = null;
        }
        return element;
    }

    public Object removeLast() {
        SingleListNode previousNode = this.head;
        for(int i=0; i<numElements-2; i++){
            previousNode = previousNode.getNext();
        }
        Object element = tail.getElement();
        previousNode.setNext(null);
        tail = previousNode;
        numElements--;
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
            SingleListNode previousNode = this.head;
            for(int i=0; i<position-1; i++){
                previousNode = previousNode.getNext();
            }
            Object element = previousNode.getNext().getElement();
            previousNode.setNext(previousNode.getNext().getNext());
            numElements--;
            return element;
        }
    }
}
