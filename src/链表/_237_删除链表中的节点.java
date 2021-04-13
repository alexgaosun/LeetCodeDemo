package 链表;

/**
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * @author MJ Lee
 *
 */
public class _237_删除链表中的节点 {
	
	public void deleteNode(ListNode node) {
		//[4,5,1,9] node =5
		//将要删除节点的值 覆盖，[4,1,1,9]
		node.val = node.next.val;
		//将node的next节点 指向下下一个（下一个是1，下下个9）因此[4,1,9]
		node.next = node.next.next;
    }
}
