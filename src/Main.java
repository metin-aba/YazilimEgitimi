class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    void ekle(int key) {
        root = ekleRecursive(root, key);
    }

    Node ekleRecursive(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = ekleRecursive(root.left, key);
        else if (key > root.key)
            root.right = ekleRecursive(root.right, key);

        return root;
    }

    void inorder() {
        inorderRecursive(root);
    }

    void inorderRecursive(Node root) {
        if (root != null) {
            inorderRecursive(root.left);
            System.out.print(root.key + " ");
            inorderRecursive(root.right);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.ekle(50);
        bst.ekle(30);
        bst.ekle(20);
        bst.ekle(40);
        bst.ekle(70);
        bst.ekle(60);
        bst.ekle(80);

        System.out.println("BST Sıralı Çıktı:");
        bst.inorder();
    }
}
