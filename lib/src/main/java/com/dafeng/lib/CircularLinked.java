package com.dafeng.lib;

import com.dafeng.lib.bean.Node;

import java.util.HashSet;
import java.util.Set;

public class CircularLinked {

    public static boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        Set<Node> set = new HashSet<>();
        while (head != null) {
            if (!set.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    //双指针
    public static boolean hasCycle2(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        Node slow = head;
        Node quick = head.next;
        while (slow != quick) {
            if (quick == null || quick.next == null) {
                return false;
            }
            slow = slow.next;
            quick = quick.next.next;

        }
        return true;
    }


}