public class BinaryTreeTraversal {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public static void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right = new Node(20);
        root.right.right = new Node(30);

        System.out.print("Inorder: "); inorder(root); System.out.println();
        System.out.print("Preorder: "); preorder(root); System.out.println();
        System.out.print("Postorder: "); postorder(root); System.out.println();
    }
}