/**
 * 
 */
package com.sorting;

/**
 * @author s727953
 *
 */
public class BinaryTreeSearch {

	class Node {
		int value;
		Node left;
		Node right;

		public Node(int val) {
			this.value = val;
		}
	}

	public Node root = null;

	public static void main(String[] args) {

		BinaryTreeSearch bst = new BinaryTreeSearch();
		int arr[] = { 2, 60, 30, 4, 10, 40 };
		int n = arr.length;
		for (int i : arr) {
			bst.binaryTree(i);
		}

		bst.display(bst.root);
		System.out.println(bst.find(123));
	}

	private boolean find(int id) {
		Node rootNode = root;
		while (rootNode != null) {
			if (id == rootNode.value) {
				return true;
			} else if (id < rootNode.value) {
				rootNode = rootNode.left;
			} else if (id > rootNode.value) {
				rootNode = rootNode.right;
			}
		}
		return false;

	};

	public void binaryTree(int currentVal) {
		Node newNode = new Node(currentVal);
		if (root == null) {
			root = newNode;
		} else {
			Node current = root;
			Node parent = null;
			while (true) {
				parent = current;
				if (currentVal < parent.value) {
					current = current.left;
					if (current == null) {
						System.out.println("---- ");
						parent.left = newNode;
						return;
					}
				} else {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}
				}
			}

		}

	}

	public void display(Node root) {
		if (root != null) {
			display(root.left);
			System.out.print(" " + root.value);
			display(root.right);
		}
	}

}