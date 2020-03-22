package cn.sabercon.algorithm.q200.q130;

import java.util.ArrayList;

/**
 * Sum Root to Leaf Numbers
 *
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
 *
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 *
 * Find the total sum of all root-to-leaf numbers.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Input: [1,2,3]
 *     1
 *    / \
 *   2   3
 * Output: 25
 * Explanation:
 * The root-to-leaf path 1->2 represents the number 12.
 * The root-to-leaf path 1->3 represents the number 13.
 * Therefore, sum = 12 + 13 = 25.
 * Example 2:
 *
 * Input: [4,9,0,5,1]
 *     4
 *    / \
 *   9   0
 *  / \
 * 5   1
 * Output: 1026
 * Explanation:
 * The root-to-leaf path 4->9->5 represents the number 495.
 * The root-to-leaf path 4->9->1 represents the number 491.
 * The root-to-leaf path 4->0 represents the number 40.
 * Therefore, sum = 495 + 491 + 40 = 1026.
 *
 * @author ywk
 * @date 2020-03-22
 */
public class Q129 {

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return sum(root, new ArrayList<>());
    }

    private int sum(TreeNode root, ArrayList<Integer> list) {
        int sum = 0;
        list.add(root.val);
        if (root.left == null && root.right == null) {
            int multi = 1;
            for (int i = list.size() - 1; i >= 0; i--) {
                sum += list.get(i) * multi;
                multi *= 10;
            }
        }
        if (root.left != null) {
            sum += sum(root.left, list);
        }
        if (root.right != null) {
            sum += sum(root.right, list);
        }
        list.remove(list.size() - 1);
        return sum;
    }

    public static class TreeNode {
        int val;

        TreeNode left;

        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
