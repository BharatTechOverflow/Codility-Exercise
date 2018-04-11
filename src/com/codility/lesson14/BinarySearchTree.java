/**
 * 
 */
package com.codility.lesson14;

/**
 * @author s727953
 *
 */
public class BinarySearchTree {
	public static Node rootNode;

	public BinarySearchTree() {
		this.rootNode = null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearchTree b = new BinarySearchTree();
		int arr[] = { 2, 3, 4, 10, 40 };
		for (int i : arr) {
			b.addNode(i);
		}

		System.out.println("Original Tree : ");
		b.display(b.rootNode);
		System.out.println(b.find(14));

	}

	public boolean find(int id) {
		Node current = rootNode;
		while (current != null) {
			if (current.value == id) {
				return true;
			} else if (current.value > id) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
		return false;
	}

	private void addNode(int currentVal) {
		Node newNode = new Node(currentVal);
		if (null == rootNode) {
			this.rootNode = newNode;
		} else {
			Node current = rootNode;
			Node parent = null;
			while (true) {
				parent = current;
				if (currentVal < parent.value) {
					current = current.left;
					if (current == null) {
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

	class Node {
		int value;
		Node left;
		Node right;

		public Node(int value) {
			super();
			this.value = value;
		}

		public Node(int value, Node left, Node right) {
			super();
			this.value = value;
			this.left = left;
			this.right = right;
		}

	}
}
