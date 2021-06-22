package com.dafeng.lib;


import com.dafeng.lib.bean.Node;

public class LinkRepeat {
    public static Node switchNode(Node head) {
        Node temp = null;
        Node next = null;
        Node cru = head;
        while (cru != null) {
            next = cru.next;
            cru.next = temp;
            temp=cru;
            cru=next;
        }
        return cru;
    }
}