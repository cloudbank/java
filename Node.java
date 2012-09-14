package interview.phonescreen;

public class Node {

    // these members are left un-encapsulated for
    // purposes of algorithm study
    // normally, these would be private with gets/sets
    public Node next = null;
    public int data;
    public Node left;
    public Node right;

    public Node(int d) {
	this.data = d;
    }

}