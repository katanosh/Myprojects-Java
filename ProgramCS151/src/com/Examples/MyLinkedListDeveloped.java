package com.Examples;

class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class KLinkedList{
	Node head;
	int size;
	public void insert(int data) {
		Node n= new Node(data);
		if (this.head != null) {
			Node tmp = this.head;
			while (tmp.next != null)
				tmp = tmp.next;
			tmp.next = n;
			
		}else {
			this.head = n;
		}
		size++;
	}
	
	public boolean delete(int data) {
		boolean fnd = false;
		
		if (this.head.data == data)
			this.head.next = null;
		else {
			Node prev = this.head;
			Node current = prev.next;
			while (current.next !=null && !fnd) {
				if (current.data == data) {
					// return true, delete the element and exit
					fnd = true;
					prev.next = current.next;
				}else {
					prev = current;
					current = current.next;
				}
			}
			
		}
		return fnd;
	}
	
	public void display() {
		Node n = this.head;
		while (n != null) {
			System.out.println("Data : " + n.data);
			n = n.next;
		}
	}
}

public class MyLinkedListDeveloped {
	public static void main(String[] args) {
		KLinkedList ll = new KLinkedList();
		ll.insert(4);
		ll.insert(10);
		ll.insert(6);
		ll.insert(15);
		ll.insert(8);
		
		ll.display();
		if (ll.delete(20)) 
			System.out.println("Found & Removed");
		else
			System.out.println("Not Found & Not Removed");
		
		if (ll.delete(6)) 
			System.out.println("Found & Removed");
		else
			System.out.println("Not Found & Not Removed");
		
		ll.display();
	}	

}
