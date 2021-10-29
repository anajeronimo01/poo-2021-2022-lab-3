public class SingleListNode {
    private Object element;
    private SingleListNode nextNode;

    public SingleListNode() {
        this.element = null;
        this.nextNode = null;
    }

    public Object getElement() {
        return this.element;
    }

    public SingleListNode getNext() {
        return this.nextNode;
    }

    public void setNext(SingleListNode  node) {
        this.nextNode = node;
    }
}
