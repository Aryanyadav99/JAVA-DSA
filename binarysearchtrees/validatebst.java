// check wheather the bst is valid or not
// approach 1--find inorder if it is sorted then tree bst
// approach 2--find the max value of leftsubtree and min value of right subtree then compare with root node and repeat the same ...
// we can direstly check then left node or right node with root node reason niche kahi badi value ho saktio hai 
// for evevry node in a binsear tree we know its min and max so use min max concept here where any of thta becomes wrong its not bst
package binarysearchtrees;

public class validatebst {
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
    public static boolean isbst(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
           if(min!=null &&root.data<=min.data){// range specify
            return false;
           }
           if(max!=null && root.data>=max.data){
            return false;
           }
         boolean b1  =isbst(root.left, min, root);
         boolean b2= isbst(root.right, root, max);
         return b1&&b2;
    }
    public static void main(String[]args){
        Node root=new Node(8);
        root.left=new Node(5);
        root.right=new Node(10);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right.right=new Node(11);
        root.left.left.left=new Node(1);
        root.left.left.right=new Node(4);
        root.right.right.right=new Node(14);
      System.out.println( isbst(root, null, null));
    }
}
