
public class LinearNode<T> {
	private LinearNode<T> next;

	private T element;

	public T t1;

	// creata na empty node.
	public LinearNode() {
		next = null;
		element = null;
	}

	// creat a node storin the specified element.
	public LinearNode(T elem) {
		next = null;
		element = elem;
	}

	// return the node that follwo this one.
	public LinearNode<T> getNext() {
		return next;
	}

	// sets the node that foolow this one.
	public void setNext(LinearNode<T> node) {
		next = node;
	}

	// return the element stored in this node.
	public T getElement() {
		return element;
	}

	// sets the element stored in this node.
	public void setElement(T elem) {
		element = elem;
	}
}
