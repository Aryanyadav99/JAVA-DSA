// we have to traverse the tree map or other map like hash map can be done througgh for each loop
// for each loop in java is used to traverswe in the collection 
//for each loop overview 
// for(type variable : collection)
// type refers wahast the type of object of collection variable is used to store that value and : and then collection whast you use 
// for ex for(char ch:"aryan") first ch have a then r then y and so on

package hashing;
 import java.util.*;

   public class tracemap {
    static class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}
    public static void main(String[] args) {
        // Example TreeMap with Integer as key and TreeNode as value
        TreeMap<Integer, TreeNode> map = new TreeMap<>();
        
        // Adding some nodes to the map
        map.put(1, new TreeNode(10));
        map.put(2, new TreeNode(20));
        map.put(3, new TreeNode(30));
        
        // List to store the TreeNode values
        List<TreeNode> nodeList = new ArrayList<>();
        
        // Traverse the map and store TreeNode values in the list
        for (Integer key : map.keySet()) {
            // map.keySet()  return the set of keys beacuse for traversing we hav eto first convert the amp into set and then we can trvaerse it 
            TreeNode node = map.get(key); // Access the TreeNode using the key
            nodeList.add(node);           // Add the TreeNode to the list
        }
        
        // Print the values in the nodeList
        System.out.println("List of TreeNodes:");
        for (TreeNode node : nodeList) {
            System.out.println("Node value: " + node.val);
        }
    }
}


