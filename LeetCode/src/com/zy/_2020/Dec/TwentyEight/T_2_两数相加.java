package com.zy._2020.Dec.TwentyEight;

/**
 * @author wzy
 * @Date 2020/12/28
 **/
public class T_2_两数相加 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = null;
        ListNode next = null;
        int i = 0;
        while (l1 != null||l2 != null){
            int v1 = l1==null?0:l1.val;
            int v2 = l2==null?0:l2.val;
            int sum = v1+v2+i;
            if (listNode==null){
                listNode = next = new ListNode(sum%10);
            }else {
                next.next = new ListNode(sum%10);
                next = next.next;
            }
            i = sum/10;
            if (l1!=null){
                l1 = l1.next;
            }
            if (l2!=null){
                l2 = l2.next;
            }
        }
        if (i>0){
            next.next = new ListNode(i);
        }
        return listNode;
    }

    public static void main(String[] args) {

    }

}
