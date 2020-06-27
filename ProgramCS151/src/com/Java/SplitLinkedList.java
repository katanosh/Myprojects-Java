package com.Java;

public class SplitLinkedList {
	Node head;
	private class Node{
		int value;
		Node next;
		private Node(int x) {
			this.value = x;
			this.next = null;
		}
	}
	
	public void insert(int x) {
		// insert a node into linked list
	}
	public Node splitLinkedList(Node list) {
		if (list == null) return null;
		Node runner = list.next;
		while (runner !=null) {
			runner = runner.next;
			if (runner == null) break;
			runner = runner.next;
			list = list.next;
		}
		Node isReturn = list.next;
		list.next = null;
		return isReturn;
	}
	public void divide() {
		splitLinkedList(head);
	}
	public static void main(String[] args) {
	SplitLinkedList ll = new SplitLinkedList();
	ll.insert(2);
	ll.insert(2);
	ll.insert(2);
	ll.insert(2);
	ll.divide();
	
	}

}
