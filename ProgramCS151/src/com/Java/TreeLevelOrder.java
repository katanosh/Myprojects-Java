package com.Java;
import java.util.LinkedList;
import java.util.Queue;

public class TreeLevelOrder {
	Node head;
	private class Node{
		private int value;
		private Node left, right;
		private Node(int x) {
			this.value = x;
			this.left = null;
			this.right = null;
		}
	}
	public void insert(int x) {
		Node node = new Node(x);
		if (head == null)
			head = node;
		else {
			Node tmp = head;
			boolean sw = true;
			while (sw) {
				if (tmp.value >= x){
					if (tmp.left != null)
						tmp = tmp.left;
					else {
						tmp.left = node;
						sw = false;
					}
				}
				if (tmp.value < x) {
					if (tmp.right != null)
						tmp = tmp.right;
					else {
						tmp.right = node;
						sw = false;
					}
				}
			}
		}
	}
	public void show () {
		traverse(head);
	}
	private void traverse(Node tree) {
		if (tree == null) return;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(tree);
		while (!queue.isEmpty()) {
			Node curr = queue.remove();
			System.out.println(curr.value);
			if (curr.left != null) queue.add(curr.left);
			if (curr.right != null) queue.add(curr.right);
		}
		
	}
	public static void main(String[] args) {
		TreeLevelOrder tree = new TreeLevelOrder();
		tree.insert(1);
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.insert(5);
		tree.insert(6);
		tree.insert(7);
		tree.show();
	}

}
