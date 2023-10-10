class Node {

    SaleRecord saleRecord;


    Node left;
    Node right;

    // totalChildren = leftChildren + rightChildren;
    int totalChildren;
    int leftChildren;
    int rightChildren;

    public Node(SaleRecord saleRecord) {
        this.saleRecord = saleRecord;
        this.left = null;
        this.right = null;
        this.leftChildren = 0;
        this.rightChildren = 0;
        this.totalChildren = 1;
    }

}