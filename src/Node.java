class Node<E> {

    SaleRecord saleRecord;
    public E item;
    Node<E> left;
    Node<E> right;
    int leftChildren;
    int rightChildren;
    int totalChildren = leftChildren + rightChildren;

    public Node(SaleRecord saleRecord) {
        this.saleRecord = saleRecord;
        this.left = null;
        this.right = null;
        this.leftChildren = 0;
        this.rightChildren = 0;
        this.totalChildren = this.rightChildren + this.leftChildren;
    }

}