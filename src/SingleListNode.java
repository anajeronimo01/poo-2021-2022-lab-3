class SingleListNode {
    private Object element;
    private SingleListNode nextNode;

    SingleListNode(Object element, SingleListNode nextNode) {
        this.element = element;
        this.nextNode = nextNode;
    }

    Object getElement() {
        return this.element;
    }
    
    SingleListNode getNext() {
        return this.nextNode;
    }

    void setNext(SingleListNode node) {
        this.nextNode = node;
    }
}