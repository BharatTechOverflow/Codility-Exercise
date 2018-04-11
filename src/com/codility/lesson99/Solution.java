package com.codility.lesson99;

class BinaryTree {
	class BstNode {
		int value;
		BstNode left;
		BstNode right;

		public BstNode() {
		}

		public BstNode(int item) {
			value = item;
			left = right = null;
		}
	}

	public BstNode root;

	public BinaryTree(int key) {
		this.root = new BstNode(key);
	}

	public BinaryTree() {
		this.root = null;
	}

}

public class Solution {

	public int solution(Tree T) {

		BinaryTree tree = new BinaryTree();

		tree.root = tree.new BstNode(8);

		tree.root.left = tree.new BstNode(2);
		tree.root.right = tree.new BstNode(6);

		tree.root.left.left = tree.new BstNode(8);
		tree.root.left.right = tree.new BstNode(7);
	}
}
