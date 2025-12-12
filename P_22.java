class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int item) {
        this.data = item;
        this.left = this.right = null;
    }
}

public class P_22 {

    TreeNode root;

    // In-order traversal
    void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Pre-order traversal
    void preorder(TreeNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Post-order traversal
    void postorder(TreeNode node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {

        P_22 tree = new P_22();

        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.print("In-order traversal: ");
        tree.inorder(tree.root);

        System.out.print("\nPre-order traversal: ");
        tree.preorder(tree.root);

        System.out.print("\nPost-order traversal: ");
        tree.postorder(tree.root);
    }
}