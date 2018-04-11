package com.codility.lession1;

import com.codility.lession1.Tree.BstNode;

class Tree {
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

	public Tree(int key) {
		this.root = new BstNode(key);
	}

	public Tree() {
		this.root = null;
	}

}

public class Solution {

	public static void main(String[] args) {
		Tree tree = new Tree();
		 
		tree.root = tree.new BstNode(8);

		tree.root.left = tree.new BstNode(2);
		tree.root.right = tree.new BstNode(6);

		tree.root.left.left = tree.new BstNode(8);
		tree.root.left.right = tree.new BstNode(7);
		System.out.println(solution(tree));
	}

	public static int solution(Tree tree) {
		return visiableNodeCount(tree.root, Integer.MIN_VALUE);
	}

	public static int visiableNodeCount(BstNode T, int maxValue) {
		if (T == null) {
			return 0;
		}

		int num = 0;

		if (T.value >= maxValue) {
			num = 1;
			maxValue = T.value;
		}

		return num + visiableNodeCount(T.left, maxValue) + visiableNodeCount(T.right, maxValue);
	}
}
