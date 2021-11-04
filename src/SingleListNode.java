class SingleListNode {
    private Object element;
    private SingleListNode nextNode;

    public SingleListNode() {
        this(null, null);
    }

    public SingleListNode(Object element, SingleListNode nextNode) {
        this.element = element;
        this.nextNode = nextNode;
    }

    public Object getElement() {
        return this.element;
    }

    public SingleListNode getNext() {
        return this.nextNode;
    }

    public void setNext(SingleListNode node) {
        this.nextNode = node;
    }
}
