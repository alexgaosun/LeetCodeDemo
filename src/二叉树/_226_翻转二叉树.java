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
	
//   public TreeNode invertTree(TreeNode root) {
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
	
//	public TreeNode invertTree(TreeNode root) {
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
	
//	public TreeNode invertTree(TreeNode root) {
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
	public TreeNode invertTree(TreeNode root) {
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




	public TreeNode invertTree2(TreeNode root) {
		if (root == null) return root;
		Queue<TreeNode> queue  = new LinkedList<>();
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











	public TreeNode levelOrderTransversal(TreeNode root) {
		if (root == null) return null;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if (node.left != null) {
				queue.offer(node.left);
			}
			if (node.right != null) {
				queue.offer(node.right);
			}
		}
		return  root;
	}
	public  List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> ret =  new  ArrayList();
		if (root==null)   return  ret;
		Queue<TreeNode> queue =  new  LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()){
			List<Integer> levelList =  new  ArrayList();
			Queue<TreeNode> tmp =  new  LinkedList<>();
			while (!queue.isEmpty()) {
				TreeNode t = queue.remove();
				levelList.add(t.val);
				if  (t.left != null) tmp.add(t.left);
				if  (t.right != null) tmp.add(t.right);
			}
			ret.add(levelList);
			queue = tmp;
		}
		return  ret;
	}
	public List<List<Integer>> levelOrderss(TreeNode root) {
		List<List<Integer>> ret =  new  ArrayList();
		if (root == null) return ret;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			List<Integer> levelList =  new  ArrayList();
			Queue<TreeNode> tmpQueue =  new  LinkedList<>();
			while (!tmpQueue.isEmpty()) {
				TreeNode node = queue.remove();
				levelList.add(node.val);
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
			ret.add(levelList);
			queue = tmpQueue;
		}
		return ret;
	}





//	public List<List<Integer>> levelOrderssTest(TreeNode root) {
//		List<List<Integer>> retList = new ArrayList<>();
//		if (root == null) return  retList;
//		Queue<TreeNode> queue = new LinkedList<>();
//		queue.offer(root);
//		while (!queue.isEmpty()){
//			Queue<TreeNode> tmpQueue = new LinkedList<>();
//			List<Integer> valList = new ArrayList<>();
//			while (!queue.isEmpty()) {
//				TreeNode node = queue.poll();
//				valList.add(node.val);
//				if (node.left != null) {
//					tmpQueue.offer(node.left);
//				}
//				if (node.right != null) {
//					tmpQueue.offer(node.right);
//				}
//			}
//			retList.add(valList);
//			queue = tmpQueue;
//		}
//		return retList;
//
//	}
































}
