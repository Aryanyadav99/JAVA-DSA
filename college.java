import java.util.*;
public class college{
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    static class info {
        TreeNode node;
        int width;

        info(TreeNode node, int width) {
            this.node = node;
            this.width = width;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<info> q = new LinkedList<>();
        q.add(new info(root, 0));
        q.add(null);
        int max = 0;
        ArrayList<Integer> al = new ArrayList<>();
        while (q.isEmpty()) {
            info i = q.remove();
            if (i == null) {
                if (q.isEmpty()) {
                    int val1 = al.get(0);
                    int val2 = al.get(al.size() - 1);
                    max = Math.max(val2 - val1 + 1, max);
                    break;
                } else {
                    int val1 = al.get(0);
                    int val2 = al.get(al.size() - 1);
                    max = Math.max(val2 - val1 + 1, max);
                    al = new ArrayList<>();
                    q.add(null);
                }
            } else {
                TreeNode node = i.node;
                int width = i.width;
                al.add(width);
                if (node.left != null) {
                    q.add(new info(node.left, 2 * width + 1));
                }
                if (node.right != null) {
                    q.add(new info(node.right, 2 * width + 2));
                }
            }
        }
        return max;
    }
}

public static void main(String[] args) {

}}