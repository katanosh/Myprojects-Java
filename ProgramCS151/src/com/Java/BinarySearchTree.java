package com.Java;

public class BinarySearchTree {
	Node head;
	private class Node{
		private int value;
		private Node left;
		private Node right;
		public Node(int x) {
			this.value = x;
			this.left = null;
			this.right = null;
		}
	}
	public void createBST(int x) {
		Node node = new Node(x);
		if (head == null) {
			head= node;
		}else {
			Node tmp = head;
			boolean sw = true;
			while (sw) {
				if (tmp.value>= x) {
					if (tmp.left!=null) 
						tmp = tmp.left;
					else {
						tmp.left = node;
						sw = false;
					}
				}
				if (tmp.value < x ) {
					if (tmp.right !=null) 
						tmp = tmp.right;
					else {
						tmp.right = node;
						sw = false;	
				    }
				}	
			}
		}
			
	}
	public void display(Node n) {
		if (n == null) { return;}
		System.out.println(n.value);
		display(n.left);
		display(n.right);	
	}
	public void show() {
		if (isBST(this.head))
			display(this.head);
		else
			System.out.println("NOT BST!");
	}
	public boolean isBST(Node n) {
		return isBST(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	public boolean isBST(Node n, int min, int max) {
		if (n == null) return true;
		if (n.value< min || n.value>max) return false;
		return isBST(n.left, min, n.value) && isBST(n.right, n.value, max);	
	}
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.createBST(2);
		bst.createBST(1);
		bst.createBST(7);
		bst.createBST(6);
		bst.createBST(5);
		bst.createBST(8);
		bst.createBST(3);
		bst.createBST(4);
		bst.show();
		

	}

}
