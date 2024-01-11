class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BinarySearchTreeSearch {
    private Node root;

    // Method to search for a node in the BST
    public boolean searchNode(int data) {
        return searchNodeRecursive(root, data);
    }

    // Recursive helper function to search for a node in the BST
    private boolean searchNodeRecursive(Node root, int data) {
        if (root == null) {
            return false;
        }

        if (data == root.data) {
            return true;
        }

        if (data < root.data) {
            return searchNodeRecursive(root.left, data);
        } else {
            return searchNodeRecursive(root.right, data);
        }
    }

    // Method to perform an inorder traversal of the BST
    public void inorderTraversal() {
        inorderTraversalRecursive(root);
        System.out.println();
    }

    // Recursive helper function for inorder traversal
    private void inorderTraversalRecursive(Node root) {
        if (root != null) {
            inorderTraversalRecursive(root.left);
            System.out.print(root.data + " ");
            inorderTraversalRecursive(root.right);
        }
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
        bst.inorderTraversal();

        // Search for nodes in the BST
        int searchValue = 40;
        if (bst.searchNode(searchValue)) {
            System.out.println("Node " + searchValue + " found in the BST.");
        } else {
            System.out.println("Node " + searchValue + " not found in the BST.");
        }
    }

    // Additional method to add a node into the BST
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
}
