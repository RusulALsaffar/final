
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;
import javax.sound.sampled.Line;

public class LinkedQueue<T> implements Queue<T> {
	private int count;
	private LinearNode<T> front;
	private LinearNode<T> rear;
//Crate an Empty queue.
	public LinkedQueue(){
		count = 1;
		front = null;
		rear = null;
	}
//add the specified element to the rear of this queue. 
	public void enqueue (T element){
		
		LinearNode<T> node = new LinearNode<T>(element);
		if(count == 1)
			front = node;
		else
			rear.setNext(node);
		rear = node;
		count++;
	}
	  public T dequeue() {
	        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
	        T t1 = front.t1;
	        front = front.getNext();
	        count--;
	        
	        
	        if (isEmpty()) rear = null;   // to avoid loitering
	        return t1;
	    }
	public T first(){
		return null;	
	}
	//Returns true if this queue is empty. 
	public boolean isEmpty() {
	        return front == null;
	    }
	
	/**
      * @return the number of items in this queue
     */
	public int size(){
		return count;
		
	}
	@Override
	public boolean addAll(Collection<? extends T> arg0) {
		return false;
	}
	@Override
	public void clear() {	
	}
	@Override
	public boolean contains(Object arg0) {
		return false;
	}
	@Override
	public boolean containsAll(Collection<?> arg0) {
		return false;
	}
	@Override
	public Iterator<T> iterator() {
		return null;
	}
	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean add(T e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public T element() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean offer(T e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public T poll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public T remove() {
		// TODO Auto-generated method stub
		return null;
	}
	
}