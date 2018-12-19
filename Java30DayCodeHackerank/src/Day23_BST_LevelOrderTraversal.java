import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Day23_BST_LevelOrderTraversal {
	
	static void levelOrder(Node root) {
		// Write your code here
		Queue<Node> q = new LinkedList();
		if (root != null) {
			// enqueue first node
			q.add(root);
			// while there are nodes to process
			while (!q.isEmpty()) {
				//System.out.println("Prining for reference");
				root = q.poll();
				System.out.print(root.data+ " ");
				if (root.left != null) {
					//System.out.println("left");	
					q.add(root.left);
				}
				if (root.right != null) {
					//System.out.println("right");
					q.add(root.right);
				}
			}
		}
		Iterator iterate = q.iterator();
		while(iterate.hasNext()) {
			System.out.print(iterate.toString()+" ");
		}
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
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
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
	}
}
