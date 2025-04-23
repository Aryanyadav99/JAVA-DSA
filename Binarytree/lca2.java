package Binarytree;

public class lca2 {
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
    // breakdown process ..total lca =left lca and right lca --- common
     public static Node Lca(Node root,int n1,int n2){
        if(root==null||root.data==n1||root.data==n2){
             return root;
        }
       Node leftlca=Lca(root.left, n1, n2);
       Node rightlca=Lca(root.right, n1, n2);
       // left lca ==valid but right null
       if(rightlca==null){
        return leftlca;
       }
       // right lca valid  but left null
       if(leftlca==null){
        return rightlca;
       }
       // none of them are null thtas means root is required lca
       return root;

     }
         public static void main(String[]args){
            Node root=new Node(1);
            root.left=new Node(2);
            root.right=new Node(3);
            root.left.left=new Node(4);
            root.left.right =new Node(5);
            root.right.left=new Node(6);
            root.right.right=new Node(7);
            int n1=4;
            int n2=5;
             Node res=Lca(root,n1,n2);
             System.out.println(res.data);
          }
}
