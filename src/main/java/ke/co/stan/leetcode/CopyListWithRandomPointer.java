package ke.co.stan.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {

    // Definition for a Node.
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }


    public Node copyRandomList(Node head) {
        if(head == null)
            return null;
        Map<Node,Node> map = new HashMap<>();
        Node temp = head;

        while(head != null){
            map.put(head,new Node(head.val));
            head = head.next;
        }
        head = temp;

        while(head != null){
            map.get(head).next = map.get(head.next);
            map.get(head).random = map.get(head.random);
            head = head.next;
        }

        return map.get(temp);
    }
}
