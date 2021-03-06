package HOT100;

import HOT100.common.ListNode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Number12 {

    /**
     *
     * 合并K个升序链表
     *
     * 给你一个链表数组，每个链表都已经按升序排列。
     *
     * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
     *
     *
     * 示例 1：
     *
     * 输入：lists = [[1,4,5],[1,3,4],[2,6]]
     * 输出：[1,1,2,3,4,4,5,6]
     * 解释：链表数组如下：
     * [
     *   1->4->5,
     *   1->3->4,
     *   2->6
     * ]
     * 将它们合并到一个有序链表中得到。
     * 1->1->2->3->4->4->5->6
     * 示例 2：
     *
     * 输入：lists = []
     * 输出：[]
     * 示例 3：
     *
     * 输入：lists = [[]]
     * 输出：[]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/merge-k-sorted-lists
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static ListNode mergeKLists(ListNode[] lists) {
        List<Integer> objects = new ArrayList<>();
        for (ListNode list : lists) {
            while(list!=null){
                objects.add(list.val);
                list = list.next;
            }
        }
        Collections.sort(objects);

        ListNode head = null;
        for (Integer object : objects) {
            ListNode newNode = new ListNode(object);
            if(head == null){
                head = newNode;
                continue;
            }
            ListNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }
}
