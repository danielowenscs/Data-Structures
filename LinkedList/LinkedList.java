package LinkedList;
public class LinkedList <E> {

	class Node <E> {
		E data;
		Node <E> next;

		public Node (E obj) {
			data = obj;
			next = null;
		}
	}

	private Node <E> head;
	private Node <E> tail;
	private int size;
	
	public LinkedList() {
		head = null;
		tail = null;
	}
	public void addFirst (Object obj) {
		Node <E> nodeToAdd = new Node<E>(obj);
		//empty case
		size++;
		if (head == null) {
			head = nodeToAdd;
			tail = nodeToAdd;
			return;
		}
		// non empty case
		nodeToAdd.next = head;
		head = nodeToAdd;
	}

	public void addLast(Object obj) {
		Node <E> nodeToAdd = new Node<E>(obj);
		//empty case
		if (tail == null) {
			head = nodeToAdd;
			tail = nodeToAdd;
			return;
		}
		// non empty case
			tail.next = nodeToAdd;
			tail = nodeToAdd;
	}
	public void removeFirst () {
		// empty case
		if (head == null) return;
		// single case
		else if (head.next == null) head = null;
		
		// more than 1 case
		else head = head.next;
	}
	public void removeLast() {
		// empty case
		if (head == null) return;
		// single case 
		else if (head.next == null) head = null;
		// more than 1 case
		else {
			Node <E> curr = head;
			while (curr.next != tail) {
				curr = curr.next;
			}
			curr.next = null;
			tail = curr;
		}
	}


	public void print() {
		Node <E> curr = head;
		int i = 0;
		while (curr != null) {
			System.out.println("index " + i + ": "  + curr.data);
			curr = curr.next;
			i++;
		}
	}

	



}