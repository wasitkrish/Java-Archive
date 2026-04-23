public class LowestCommonAncestor{
    static class Node{
        int data;
        Node right, left;
        Node(int data){
            this.data=data;
            right=left=null;
        }
    }
    public static Node lca(Node node,int p, int q){
        if(node==null) return null;
        if(node.data==p || node.data==q) return node;
        Node leftresult = lca(node.left,p,q);
        Node rightresult = lca(node.right,p,q);
        if(leftresult!=null && rightresult!=null) return node;
        return (leftresult!=null)? leftresult:rightresult;
    }
    public static void main(String[] args){
       Node root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       Node result = lca(root,4,5);
        System.out.println("LCA(4,5): "+((result!=null)? result.data:"Not found"));
        result = lca(root,2,4);
        System.out.println("LCA(2,4): "+((result!=null)? result.data:"Not found"));
    }
}