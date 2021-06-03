package 二叉树;

import java.util.*;

public class 二叉树遍历_迭代 {
    /**
     * 前序遍历 144
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {//144 前序
        LinkedList<Integer> retList = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty() || root!=null){
            if(root!=null){
                retList.add(root.val);
                if(root.right!=null) stack.push(root.right);//先将right节点入栈
                root = root.left;//取left
            }else {
                root = stack.pop();
            }
        }
            return retList;
    }

    /**
     * 中序遍历 94
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        LinkedList<Integer> retList = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty() || root!=null){
            if(root!=null){
                stack.push(root);
                root = root.left;
            } else{
                root = stack.pop();
                retList.add(root.val);
                root = root.right;
            }
        }
        return retList;
    }

    /**
     * 后序遍历 145
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> retList = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                retList.addFirst(root.val);
                root = root.right;
            }else {
                root = stack.pop();//将加入入栈的子节点的弹栈
                root = root.left;
            }
        }
        return retList;
    }

    /*
            1(root)
      null    2
            3
     */
    public List<Integer> testPreorderTraversal(TreeNode root) {//[1,null,2,3]
        LinkedList<Integer> retList = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                retList.add(root.val);//1,
                if (root.right != null) stack.push(root.right);
                root = root.left;
            }else {
                root = stack.pop();
            }
        }
        return retList;
    }

}

