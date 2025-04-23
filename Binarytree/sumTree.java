package Binarytree;

public class sumTree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int sumtree(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sumtree(root.left);
        int rightsum=sumtree(root.right);
        int data=root.data;
        int newleft=0;
        int newright=0;
        if(root.left!=null){
            newleft=root.left.data;
        }
        if(root.left==null){
           newleft=0;
        }
        if(root.right!=null){
            newright=root.right.data;
        }
        if(root.left==null){
            newright=0;
        }
        root.data=leftsum+rightsum+data+newleft+newright;
        return data;
    }   
     public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
     }
    public static void main(String[]args){
      Node root =new Node(1);
      root.left=new Node(2);
      root.right=new Node (3);
      root.left.left=new Node (4);
      root.left.right=new Node(5);
      root.right.left=new Node(6);
      root.right.right=new Node(7);
       sumtree(root);
        preorder(root);

    }
}
