package com.isbank.session1.solid.liskovsubstition;

public class Rectangle {
	private int length;
	private int height;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getArea() {
		return (length * height);
	}
}
