package com.bridgelabz.binary_search_tree;

public class MyBinaryNode<T extends Comparable<T>> {
	private T data;
	private MyBinaryNode left, right;

	
	public MyBinaryNode(T data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public T getData() {
		return data;
	}

	
	public void setData(T data) {
		this.data = data;
	}

	
	public MyBinaryNode getLeft() {
		return left;
	}

	
	public void setLeft(MyBinaryNode left) {
		this.left = left;
	}

	
	public MyBinaryNode getRight() {
		return right;
	}

	
	public void setRight(MyBinaryNode right) {
		this.right = right;
	}
}