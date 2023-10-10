import java.util.Scanner;

import javax.swing.tree.TreeNode;

class BST{
    Node root;
 
    // Constructor
    BST() {
        root = null;
    }
 
    // A utility function to insert
    // a new node with given key in BST
    public void insert(SaleRecord saleRecord) {
        root = insertRec(root, saleRecord);
    }

    private Node insertRec(Node root, SaleRecord saleRecord) {
        if (root == null) {
            return new Node(saleRecord);
        }

        if (saleRecord.getDate().compareTo(root.saleRecord.getDate()) < 0) {
            root.leftChildren++;
            root.left = insertRec(root.left, saleRecord);
        } else {
            root.rightChildren++;
            root.right = insertRec(root.right, saleRecord);
        }
        root.totalChildren = root.leftChildren + root.rightChildren + 1;

        return root;
    }


    /* Compute the "maxDepth" of a tree -- the number of
       nodes along the longest path from the root node
       down to the farthest leaf node.*/
    public  int maxDepth(Node node)
    {
        if (node == null)
            return 0;
        else {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }


    public int findHeight(Node root){
        if (root == null) {
            return -1;
        }
        int left = findHeight(root.left);
        int right = findHeight(root.right);
        if (left > right) {
            return left + 1;
        } else {
            return right + 1;
        }

    }

    // // Utility function to search a key in a BST
    // Node search(Node root, int key) {
    //     // Base Cases: root is null or key is present at root
    //     if (root == null || root.key == key)
    //         return root;
 
    //     // Key is greater than root's key
    //     if (root.key < key)
    //         return search(root.right, key);
 
    //     // Key is smaller than root's key
    //     return search(root.left, key);
    // }
 
    public String toString(){
       String result = "";
        if (root == null) {
            return "";
        }
    
        result += root.left.toString();
        result += root.right.toString();
        result += root.toString();
        return result.toString();
    }
}