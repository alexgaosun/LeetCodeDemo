package 二叉树;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/invert-binary-tree/
 * @author MJ Lee
 *
 */
public class _226_翻转二叉树 {
	
//   public TreeNode invertTree(TreeNode root) {//后序
//	   if (root == null) return root;
//	   
//	   TreeNode tmp = root.left;
//	   root.left = root.right;
//	   root.right = tmp;
//	   
//       invertTree(root.left);
//       invertTree(root.right);
//       
//       return root;
//   }
	
//	public TreeNode invertTree(TreeNode root) {//前序
//	   if (root == null) return root;
//	   
//       invertTree(root.left);
//       invertTree(root.right);
//	   
//	   TreeNode tmp = root.left;
//	   root.left = root.right;
//	   root.right = tmp;
//       
//       return root;
//    }
	
//	public TreeNode invertTree(TreeNode root) {//中序
//	   if (root == null) return root;
//	   
//       invertTree(root.left);
//
//	   TreeNode tmp = root.left;
//	   root.left = root.right;
//	   root.right = tmp;
//
//       invertTree(root.left);
//       
//       return root;
//    }
	public TreeNode invertTree(TreeNode root) {//层序遍历翻转
		if (root == null) return root;
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
		    TreeNode tmp = node.left;
		    node.left = node.right;
		    node.right = tmp;
			if (node.left != null) {
				queue.offer(node.left);
			}
			
			if (node.right != null) {
				queue.offer(node.right);
			}
		}
		return root;
	}


}
