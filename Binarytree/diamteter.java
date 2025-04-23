//diamter of a tress  refers thats taking the numbers of nodes to the longest path between two leaves
// find the diamter that can be goes through root or subtree by recursion  thats helps to find longest diameter 
//...APPROACH 1 TC0(N2);   
///  IN any tree node we can find left and right height so lh+rh+1;
//find diameter of root first; then find its left dubtree diameter then its reight and compare all which is max thats my lomgest diameter;

package Binarytree;

public class diamteter {
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
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    static class binarytree{
          static int idx=0;
          public Node buildtree(int sel[]){
            
              if(sel[idx]==-1){
                idx++;
                return null;
              }
              Node n1 = new Node(sel[idx]);
              idx++;
              n1.left=buildtree(sel);
              n1.right=buildtree(sel);
              return n1;
          } 
    }
    public static int diamter(Node root){
        if(root==null){
            return 0;
        }
        int ld=diamter(root.left);
        int lh=height(root.left);
        int rd=diamter(root.right);
        int rh=height(root.right);
        int sd=lh+rh+1;
        return Math.max(sd,Math.max(rd, ld));
    }
   public static void main(String[]args){
    int sequence[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1,7,-1,-1}; 
    binarytree bt= new binarytree();
    Node root = bt.buildtree(sequence);
     int n=diamter(root);
     System.out.println(n);
   } 
}
