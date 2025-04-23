//objesctive == find the min distance between two nodes
// approach == using lca  lca to node1 dis + lca to node 2 dis  
package Binarytree;

public class mindis {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node lca(Node root,int n1,int n2){
       if (root==null||root.data==n1||root.data==n2) {
        return root;
       }
       Node leftlca=lca(root.left, n1, n2);
       Node rightlca=lca(root.right, n1, n2);
       if(leftlca==null){
        return rightlca;
       }
       else if(rightlca==null){
        return leftlca;
       }
       return root;
    }
    public static int dis(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int ldis=dis(root.left, n);
        int rdis=dis(root.right, n);
        if(ldis==-1 && rdis==-1){
            return -1;
        }
        if(ldis==-1){
           return rdis+1;
        }
        else {
            return ldis+1;
        }
      
    }
    public static int mdis(Node root,int n1,int n2){
        Node lca=lca(root, n1, n2);
        int dis1=dis(lca,n1);
        int dis2=dis(lca,n2);
        return dis1+dis2;
    }
    public static void main(String[]args){
    
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right =new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        int n1=3;
        int n2=5;
       int res= mdis(root,n1,n2);
       System.out.println(res);
     
    }
}
