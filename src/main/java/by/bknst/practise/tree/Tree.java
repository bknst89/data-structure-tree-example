package by.bknst.practise.tree;

import java.io.OutputStream;

public interface Tree {

	void insert(int value);

	boolean contains(int value);

	void printOutInOrder(OutputStream output);

	void printOutPreOrder(OutputStream output);

	void printOutPostOrder(OutputStream output);
}
