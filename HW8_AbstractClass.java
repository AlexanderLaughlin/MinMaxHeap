
public abstract class HW8_AbstractClass<E> {
	
	protected E[] MMHeap; // Pointer to the heap array
	protected int capacity;   // Maximum size of the heap
	protected int number;     // Number of things now in heap	
	
	public abstract E findMin();
	
	public abstract E findMax();
	
	public abstract void deleteMin();
	
	public abstract void deleteMax();
	
	public abstract void insert(E key);
	
	public abstract void buildheap(E[] list);

}
