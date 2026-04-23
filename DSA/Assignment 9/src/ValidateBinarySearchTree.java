public class ValidateBinarySearchTree{
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static boolean isValid(Node node, long min, long max){
        if(node==null) return true;
        if(node.data<=min||node.data>=max) return false;
        return isValid(node.left,min,node.data) && isValid(node.right,node.data,max);
    }
    public static void main(String[] args){
        Node root = new Node(10);
        root.left=new Node(5);
        root.left.left=new Node(6);
        root.right=new Node(15);
        root.right.left=new Node(20);
        System.out.println("Test 1: " +
                (isValid(root, Long.MIN_VALUE, Long.MAX_VALUE) ? "Valid BST" : "Not a valid BST"));
        Node root2 = new Node(10);
        root2.left=new Node(6);
        root2.left.left=new Node(5);
        root2.right=new Node(15);
        root2.right.right=new Node(20);
        System.out.println("Test 2: "+(isValid(root2, Long.MIN_VALUE,Long.MAX_VALUE)? "Valid BST":"Not a valid BST"));
    }
}