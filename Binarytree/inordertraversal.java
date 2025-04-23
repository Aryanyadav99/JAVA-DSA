package Binarytree;

public class inordertraversal {
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
  public static class binarytree{ 
    static int idx=-1;
    public Node buildtree(int sequence[]){
            idx++;
            if(sequence[idx]==-1){
                  return null;
            }
            Node n1=new Node(sequence[idx]);
            n1.left=buildtree(sequence);
            n1.right=buildtree(sequence);
            return n1;
    }
    //now we have to traverse in inorder way(in between root bich aegi);
    //pahle left subtree print hoga thenroot then right
      public void inordertraversal(Node root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        inordertraversal(root.left);
        System.out.print(root.data+" ");
        inordertraversal(root.right);

      }
  }
  public static void main(String[]args){
    int sequence[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    binarytree bt=new binarytree();
    Node root=bt.buildtree(sequence);
    bt.inordertraversal(root);
  }

}
