package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 二叉树遍历 {
    /**
     * 前序遍历 144
     * @param root
     * @return
     */
    public  List<Integer> preorderTraversal(TreeNode root) {//144 前序
        List<Integer> retList = new ArrayList<>();
        preorderTraversal(retList,root);
        return retList;
    }
    private  void preorderTraversal(List<Integer> retList, TreeNode root){
        if (root != null) {
            retList.add(root.val);
            preorderTraversal(retList,root.left);
            preorderTraversal(retList,root.right);
        }
    }

    /**
     * 中序遍历 94
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> retList = new ArrayList<>();
        inorderTraversal(retList, root);
        return retList;
    }

    private void inorderTraversal(List<Integer> retList, TreeNode root) {
        if (root != null) {
            inorderTraversal(retList, root.left);
            retList.add(root.val);
            inorderTraversal(retList, root.right);
        }
    }

    /**
     * 后序遍历 145
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> retList = new ArrayList<>();
        postorderTraversal(retList, root);
        return retList;
    }
    private void postorderTraversal(List<Integer> retList, TreeNode root) {
        if (root != null) {
            postorderTraversal(retList, root.left);
            postorderTraversal(retList, root.right);
            retList.add(root.val);
        }
    }

    /**
     * 层序遍历 102
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> retList = new ArrayList<>();
        if (root == null) return retList;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> valList = new ArrayList<>();
            Queue<TreeNode> tmpQueue = new LinkedList<>();
            while (!queue.isEmpty()) {//队列不为空队列
                TreeNode tmpNode = queue.poll();
                valList.add(tmpNode.val);
               if (tmpNode.left != null) {
                   tmpQueue.offer(tmpNode.left);
               }
               if (tmpNode.right != null) {
                   tmpQueue.offer(tmpNode.right);
               }
            }
            retList.add(valList);
            queue = tmpQueue;//临时队列赋值
        }
        return retList;
    }

}
