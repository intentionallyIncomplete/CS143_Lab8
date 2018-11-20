import Stack.Node;

/**
 * Class Description:
 * @author Ian Bryan
 * @version Nov 19, 2018
 * 
 * Implements the First In First Out structure (a.k.a Queue)
 */
public class Queue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Stack<Character> a = new Stack<Character>();
		Queue<Character> q = new LinkedList<Character>();
		a.push('R');
		a.push('a');
		a.push('c');
		a.push('e');
		//a.push('c');
		//a.push('a');
		a.push('r');
		System.out.println("Size : " + a.size());
		while(!a.isEmpty()) {
			System.out.println(a.pop());
		}
	}
	/**
	 * @author Ian Bryan
	 * @version Nov 19, 2018
	 * 
	 * Contains data that implements a Node structure.
	 */
	class Node{
		// Data items
		Object data = null;
		Node next = null;

		/**
		 * @param d - Some data
		 * @param n - A Node item
		 *
		 * Constructor for inner-class Node to handle a peice of data
		 * and a link to another Node in the chain.
		 */
		public Node(Object d, Node n) {
			this.data = d;
			this.next = n;
		}
	}
}

