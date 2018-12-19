import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node1 {
	Node1 left, right;
	int data;

	Node1(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Day23_BST_LevelOrderTraversal {

	static void levelOrder(Node1 root) {
		// Write your code here
		Queue<Node1> q = new LinkedList();
		if (root != null) {
			// enqueue first node
			q.add(root);
			// while there are nodes to process
			while (!q.isEmpty()) {

				root = q.poll();
				System.out.print(root.data + " ");
				if (root.left != null) {
					q.add(root.left);
				}
				if (root.right != null) {
					//
					q.add(root.right);
				}
			}
		}
	}

	public static Node1 insert(Node1 root, int data) {
		if (root == null) {
			return new Node1(data);
		} else {
			Node1 cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node1 root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
	}
}
