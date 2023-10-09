class Node<E> {
    SaleRecord saleRecord;
    Node<E> left;
    public E item;
    Node<E> right;
    int leftChildren;
    int rightChildren;

    public Node(SaleRecord saleRecord) {
        this.saleRecord = saleRecord;
        this.left = null;
        this.right = null;
        this.leftChildren = 0;
        this.rightChildren = 0;
    }

}