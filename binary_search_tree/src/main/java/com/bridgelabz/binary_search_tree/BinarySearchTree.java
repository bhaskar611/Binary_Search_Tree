package com.bridgelabz.binary_search_tree;

public class BinarySearchTree {
	private MyBinaryNode root;

	
	public MyBinaryNode getRoot() {
		return root;
	}

	
	public void setRoot(MyBinaryNode root) {
		this.root = root;
	}

	
	public <T extends Comparable<T>> void addData(T t) {
		root = addDataRecursive(root, t);
		return;
	}

	
	private <T extends Comparable<T>> MyBinaryNode addDataRecursive(MyBinaryNode node, T t) {
		if (node == null)
			return new MyBinaryNode(t);
		int compare = node.getData().compareTo(t);
		if (compare < 0)
			node.setRight(addDataRecursive(node.getRight(), t));
		else if (compare > 0)
			node.setLeft(addDataRecursive(node.getLeft(), t));
		return node;
	}

	
	public <T> void printTreeInorder(MyBinaryNode node) {
		if (node == null)
			return;
		
		printTreeInorder(node.getLeft());
		System.out.print(node.getData() + " ");
		
		printTreeInorder(node.getRight());
	}

	
	public int size(MyBinaryNode node) {
		return (node == null) ? 0 : 1 + size(node.getLeft()) + size(node.getRight());
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Binary Search Trees program");
		BinarySearchTree bst = new BinarySearchTree();
		bst.addData(56);
		bst.addData(30);
		bst.addData(70);
		System.out.println("The tree is as follows");
		bst.printTreeInorder(bst.root);
		System.out.println("\nThe number of elements in bst are " + bst.size(bst.root));
	}
}
