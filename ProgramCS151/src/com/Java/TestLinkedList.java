package com.Java;
class LinkedList{
	Node head;
	int size;

	private class Node{
		private int data;
		private Node next;
		public Node() {
			this.data = 0;
			this.next = null;
		}
		public Node(int d) {
			this.data = d;
			this.next = null;
		}

	}
	public LinkedList() {
		//this.head= new Node();
		this.size = 0;
	}
	public void insert (int n) {
		System.out.println("n: " + n);
		Node node = new Node(n);
		
		if (head != null) {
			System.out.println("added");
			Node tmp=head;
			while(tmp.next != null)
				tmp = tmp.next;
			tmp.next = node;
		}else {
			System.out.println("Node inserted : " + node.data);
			head = node;
		}
		this.size++;
	}
	public void display() {
		Node tmp;
		if (head !=null) {
			tmp = head;
			while (tmp != null) {
				System.out.println("--> " + tmp.data);
				tmp = tmp.next;
			}
		}
	}
	public Node nthElement(int n) {
		Node curr= head;
		if (head != null && n<=this.size) {
			int k = 1;
			while (curr != null) {
				if (k<n) {
					k++;
				} else {
					System.out.println(curr.data);
				}
			    curr = curr.next;
			}
		}
		return curr;
	}
}
public class TestLinkedList {
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		System.out.println("Insert elements into list");
		ll.insert(3);
		ll.insert(5);
		ll.insert(9);
		ll.insert(11);
		ll.insert(2);
		ll.display();
		ll.nthElement(3);

	}

}
