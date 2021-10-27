public class SingleListNode {
    private Object element;
    private SingleListNode nextNode;

    public SingleListNode(Object element, SingleListNode nextNode) {
        this.element = element;
        this.nextNode = nextNode;
    }

    public SingleListNode(Object element) {
        this.element = element;
        this.nextNode = null;
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