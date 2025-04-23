package Binarytree;
public class leavesno {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
   static class Binarytree{
    static int  i=-1;
    public Node buildtrees(int seq[])
    {
         i++;
        if(seq[i]==-1){
            return null;
        }
           Node n1=new Node(seq[i]);
           n1.left=buildtrees(seq);
           n1.right=buildtrees(seq);
           return n1;
    }
    public int count =0;;
   public int noofleaves(Node root){
    if(root==null){
        return 0;
    }
    if(root.left==null && root.right==null){
        return 1;
    }
    int ll=noofleaves(root.left);
    int rl=noofleaves(root.right);
    return ll+rl;
   }
   }



    public static void main(String[] args) {
        int sequence[]={11,2,4,-1,-1,5,-1,-1,3,-1,-1};
        Binarytree bt=new Binarytree();
        Node root=bt.buildtrees(sequence);
       
        int ht=bt.noofleaves(root);
        System.out.println(ht);

    }
}

