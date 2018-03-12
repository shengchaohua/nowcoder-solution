package com.sch.JianZhiOffer;

import java.util.ArrayList;
import java.util.Collections;

public class PrintListFromTailToHead {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<>();
		while(listNode != null) {
			list.add(listNode.val);
			listNode = listNode.next;
		}
		Collections.reverse(list);
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		PrintListFromTailToHead pl = new PrintListFromTailToHead();
		System.out.println(pl.printListFromTailToHead(node1));
	}

}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}