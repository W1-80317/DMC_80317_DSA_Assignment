class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BinarySearchTreeNonLeaf {
    private Node root;

    // Method to add a node into the BST
    public void addNode(int data) {
        root = addNodeRecursive(root, data);
    }

    // Recursive helper function to add a node into the BST
    private Node addNodeRecursive(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = addNodeRecursive(root.left, data);
        } else if (data > root.data) {
            root.right = addNodeRecursive(root.right, data);
        }

        return root;
    }

    // Method to count the number of non-leaf nodes in the BST
    public int countNonLeafNodes() {
        return countNonLeafNodesRecursive(root);
    }

    // Recursive helper function to count the number of non-leaf nodes in the BST
    private int countNonLeafNodesRecursive(Node root) {
        if (root == null || (root.left == null && root.right == null)) {
            // Node is null or a leaf node
            return 0;
        }

        // Recursively count non-leaf nodes in the left and right subtrees
        int leftCount = countNonLeafNodesRecursive(root.left);
        int rightCount = countNonLeafNodesRecursive(root.right);

        // Include the current node as a non-leaf node
        return leftCount + rightCount + 1;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Add nodes to the BST
        bst.addNode(50);
        bst.addNode(30);
        bst.addNode(70);
        bst.addNode(20);
        bst.addNode(40);
        bst.addNode(60);
        bst.addNode(80);

        // Perform inorder traversal to display the BST
        System.out.println("Inorder Traversal of the BST:");
        bst.inorderTraversal(bst.root);

        // Count the number of non-leaf nodes
        int nonLeafNodeCount = bst.countNonLeafNodes();
        System.out.println("Number of Non-Leaf Nodes in the BST: " + nonLeafNodeCount);
    }

    // Method to perform an inorder traversal of the BST
    public void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }
}
