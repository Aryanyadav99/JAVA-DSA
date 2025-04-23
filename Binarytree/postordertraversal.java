package Binarytree;

public class postordertraversal {

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
    //now we have to traverse in postorder way(root last me hoga);
    //pahle left subtree print hoga then right then root
      public void postordertraversal(Node root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        postordertraversal(root.left);
        postordertraversal(root.right);
        System.out.print(root.data+" ");
      }
  }
  public static void main(String[]args){
    int sequence[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    binarytree bt=new binarytree();
    Node root=bt.buildtree(sequence);
    bt.postordertraversal(root);
  }

}

