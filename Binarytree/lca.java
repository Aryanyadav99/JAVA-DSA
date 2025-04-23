// given :-- two nodes 
//objrctive :-- we have to find lowest(first)from bottom common ansestors 
//lac-- node se root ki taraf jao and first common node will be lca 
//apprach :- make two arraylist for storing path from root to node then trace that path to find the common the ansesoter
//jaise  hi last wala alag mile  uske pahle wala common anscestor hai

package Binarytree;
import java.util.*;
public class lca {
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
     public static boolean pathfinder(Node root,ArrayList<Node>path,int n){
        if(root==null){
            return false ;
        }
        path.add(root);
        if(root.data==n){
            return true;
        }
        boolean leftlc=pathfinder(root.left, path, n);
        boolean rightlc=pathfinder(root.right, path, n);
        if(leftlc||rightlc){
            return true;
        }
        path.remove(path.size()-1);
        return false;
     }
    public static void Lca(Node root,int n1,int n2){//we have to find the path from root to node thtas stores in arraylist
        ArrayList<Node>path1=new ArrayList<>();
        ArrayList<Node>path2=new ArrayList<>();
        pathfinder(root,path1,n1);//both of them basically filled arraylist as per requirement 
        pathfinder(root,path2,n2);
        int i=0;//as a pointer to check both of list
        for(;i<path1.size()&&i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        i=i-1;
        System.out.println((path1.get(i)).data);

    }
    public static void main(String[]args){
      Node root=new Node(1);
      root.left=new Node(2);
      root.right=new Node(3);
      root.left.left=new Node(4);
      root.left.right =new Node(5);
      root.right.left=new Node(6);
      root.right.right=new Node(7);
      int n1=7;
      int n2=6;
      Lca(root,n1,n2);
    }
}
