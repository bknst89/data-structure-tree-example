package by.bknst.practise.tree;

import java.io.IOException;
import java.io.OutputStream;

public class Node implements Tree {
    private Node left, right;
    private int value;

    Node(int value) {
        this.value = value;
    }

    @Override
    public void insert(int value) {
        if (this.value >= value) {
            if (this.left != null) {
                this.left.insert(value);
            } else {
                this.left = new Node(value);
            }
        } else {
            if (this.right != null) {
                this.right.insert(value);
            } else {
                this.right = new Node(value);
            }
        }
    }

    @Override
    public boolean contains(int value) {
        if (value == this.value) {
            return true;
        }

        if (value < this.value) {
            if (this.left != null) {
                return this.left.contains(value);
            } else {
                return false;
            }
        } else {
            if (this.right != null) {
                return this.right.contains(value);
            } else {
                return false;
            }
        }
    }

    @Override
    public void printOutInOrder(OutputStream output) {
        try {
            if (this.left != null) {
                output.write(this.value);
            }
            output.write(this.value);
            if (this.right != null) {
                output.write(this.value);
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    @Override
    public void printOutPreOrder(OutputStream output) {
        try {
            output.write(this.value);
            if (this.left != null) {
                output.write(this.value);
            }
            if (this.right != null) {
                output.write(this.value);
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    @Override
    public void printOutPostOrder(OutputStream output) {
        try {
            if (this.left != null) {
                output.write(this.value);
            }
            if (this.right != null) {
                output.write(this.value);
            }
            output.write(this.value);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
