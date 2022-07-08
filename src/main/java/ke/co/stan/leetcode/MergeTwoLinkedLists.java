package ke.co.stan.leetcode;

public class MergeTwoLinkedLists {

    public static void main(String[] args) {
        MergeTwoLinkedLists mergeTwoLinkedLists = new MergeTwoLinkedLists();
        mergeTwoLinkedLists.mergeTwoLists(null, null);
    }


    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 != null && list2 != null) {
            return list1.val > list2.val ?
                    new ListNode(list2.val, mergeTwoLists(list1, list2.next)) :
                    new ListNode(list1.val, mergeTwoLists(list1.next, list2));
        } else {
            return list1 == null ? list2 : list1;
        }

    }

    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {

        if(list1 == null) return list2; // if list 1 is null, return 2
        if(list2 == null) return list1; // if list 2 is null return 1

        if(list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        else{
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }

    }
}
