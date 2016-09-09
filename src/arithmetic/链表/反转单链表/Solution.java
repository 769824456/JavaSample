package arithmetic.链表.反转单链表;

import org.junit.Test;

/**
 * Created by : yulongsun
 * Date on : 2016/9/8
 * Desc : 反转单链表
 */
public class Solution {
    /**
     * 测试
     */
    @Test
    public void testReverse() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        ListNode newHead = reverseList(l1);
        while (newHead.next!=null){
            System.out.printf(newHead.val+"->");
        }
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode reverseList(ListNode head) {
        //如果头节点为空
        if (head == null) {
            return null;
        }
        ListNode newHead = null;
        ListNode pNode = head;
        ListNode pPrev = null;
        while(pNode!=null){
            ListNode pNext = pNode.next;
            if(pNext==null)
                newHead = pNode;
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }

        return newHead;
    }

}
