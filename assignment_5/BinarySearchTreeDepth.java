class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BinarySearchTreeDepth {
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

    // Method to return the level/depth of a given node in the BST
    public int getNodeLevel(int targetData) {
        return getNodeLevelRecursive(root, targetData, 1);
    }

    // Recursive helper function to return the level/depth of a given node in the BST
    private int getNodeLevelRecursive(Node root, int targetData, int level) {
        if (root == null) {
            return 0;
        }

        if (targetData == root.data) {
            return level;
        } else if (targetData < root.data) {
            return getNodeLevelRecursive(root.left, targetData, level + 1);
        } else {
            return getNodeLevelRecursive(root.right, targetData, level + 1);
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
        bst.inorderTraversal(bst.root);

        // Get the level/depth of a given node
        int targetNodeData = 60;
        int nodeLevel = bst.getNodeLevel(targetNodeData);

        if (nodeLevel != 0) {
            System.out.println("Level/Depth of Node " + targetNodeData + " in the BST: " + nodeLevel);
        } else {
            System.out.println("Node " + targetNodeData + " not found in the BST.");
        }
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
