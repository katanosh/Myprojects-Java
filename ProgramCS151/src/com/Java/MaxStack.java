/*
 * this code return the maximum value in stack in O(1)
 */
package com.Java;

public class MaxStack {
	Node top;
	Node max;
	private class Node{
		private int data; 
		private Node next;
		private Node oldMax;
		public Node(int x) {
			this.data = x;
			this.next=null;
			this.oldMax = null;
		}
	}
	public MaxStack() {}
	
	public void push(int x) {
		Node node = new Node(x);
		if (top == null) {
			top = node;
		}else {
			node.next = top;
			top = node;
		}
		if (max == null || node.data > max.data) {
				top.oldMax = max;
				max = node;
		}
	}
	public int pop() {
		if (top == null) throw new NullPointerException();
		if (top.oldMax != null) {
			max = top.oldMax;
		}
		int temp = top.data;
		top = top.next;
		
		
		return temp;
		
	}
	public int max() {
		if (max == null) throw new NullPointerException();
		return max.data;
	}
	
	public void dispaly() {
		Node curr= top; 
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
	
	public static void main(String[] args) {
		MaxStack stack = new MaxStack();
		stack.push(10);
		stack.push(4);
		stack.push(15);
		stack.push(8);
		stack.dispaly();
		System.out.println("Max: " + stack.max());
		System.out.println("Pop -----> " + stack.pop());
		System.out.println("Pop -----> " + stack.pop());
		System.out.println(stack.max());
		
		
		
		
		
	}

}
