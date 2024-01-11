class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BinarySearchTreeLeaf {
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

    // Method to count the number of leaf nodes in the BST
    public int countLeafNodes() {
        return countLeafNodesRecursive(root);
    }

    // Recursive helper function to count the number of leaf nodes in the BST
    private int countLeafNodesRecursive(Node root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            // Node is a leaf node
            return 1;
        }

        // Recursively count leaf nodes in the left and right subtrees
        int leftCount = countLeafNodesRecursive(root.left);
        int rightCount = countLeafNodesRecursive(root.right);

        return leftCount + rightCount;
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

        // Count the number of leaf nodes
        int leafNodeCount = bst.countLeafNodes();
        System.out.println("Number of Leaf Nodes in the BST: " + leafNodeCount);
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
