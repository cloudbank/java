package interview;

import interview.phonescreen.Node;

import java.util.LinkedList;

public class BFS {

    public static boolean bfs(Node root, int value) throws Exception {
	if (root == null)
	    throw new Exception("null input");

	LinkedList<Node> list = new LinkedList<Node>();
	Node current;
	list.add(root);
	while (!list.isEmpty()) {
	    current = list.remove();
	    if (current.data == value) {
		return true;
	    }
	    if (current.left != null) {
		list.add(current.left);
	    }
	    if (current.right != null) {
		list.add(current.right);
	    }

	}
	return false;
    }

    public static void main(String[] args) {
	Node root = new Node(20);
	Node second = new Node(2);
	Node third = new Node(21);
	root.left = second;

	root.right = third;
	Node fourth = new Node(1);
	second.left = fourth;
	try {
	    System.out.println(bfs(root, 12));
	    System.out.println(bfs(root, 21));
	    System.out.println(bfs(root, 3));
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
