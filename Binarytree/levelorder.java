package Binarytree;
import java.util.*;
public class levelorder {
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
    // for level order we use iterative approach with a datastructre called queue
    // in coding world two terms ar used DFS BFS
    //DFS- deapth firstt search -- pahle dept me jao   previous all traversal
    // BFS-breath first approach-- breadth ko priority do -- level order possible by fifo property (queue);
    //dekho pahle add karo root ko queue me phir use niakl ke print kar do then uske left aur right ko add karo phir unhne nikal ke print kar do and so on
    //on every level we want a next line so i can represent in null inside queue thtas represent next line 
    //jaise hi null ae use nikalo print next line and usse vaps se andae dal do for further use
    public void levelordertraversal(Node root){
      if(root==null){
        return;
      }
      Queue<Node> q=new LinkedList<>();
       q.add(root);
       q.add(null);
      while(!q.isEmpty()){
        Node curr=q.remove();
        if(curr==null){
          System.out.println();
          if(q.isEmpty()){
            break;
          }
          else{
            q.add(null);//ye next line prvide karayega after new left right node   [it only adjust the null to new position for next line] 
          }
        }
        else{
          System.out.print(curr.data+" ");
         if(curr.left!=null){
          q.add(curr.left);
         }
         if(curr.right!=null){
          q.add(curr.right);
         }

        }
      }
    }
  }
  public static void main(String[]args){
    int sequence[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    binarytree bt=new binarytree();
    Node root=bt.buildtree(sequence);
    bt.levelordertraversal(root);
  }

}

