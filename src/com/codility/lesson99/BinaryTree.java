package com.codility.lesson99;

import com.codility.lession1.BinaryTree;

public class BinaryTree {

	public class Node {
		int key;
		Node left, right;

		public Node() {
		}

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	public Node root;

	/**
	 * @param root
	 */
	public BinaryTree(int key) {
		this.root = new Node(key);
	}

	public BinaryTree() {
		this.root = null;
	}

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();

		// create root
		tree.root = tree.new Node(1);
		// /* 2 and 3 become left and right children of 1

		tree.root.left = tree.new Node(2);
		tree.root.right = tree.new Node(3);

		tree.root.left.left = tree.new Node(4);

	}

}
