public class searchbst {
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static boolean search(Node root, int key){
        if(root == null) return false;
        if(root.data==key) return true;
        return search(root.left,key) || search(root.right,key);
    }
    public static void main(String[] args){
        Node root = new Node(8);
        root.left=new Node(3);
        root.right=new Node(10);
        int key =10;
        if(search(root,key)){
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}