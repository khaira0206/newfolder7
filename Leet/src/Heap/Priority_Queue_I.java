package Heap;

public class Priority_Queue_I {

	int[] heap;
	int capacity, size;
	public Priority_Queue_I(int capacity){
		this.capacity = capacity + 1;
		heap = new int[this.capacity];
		size = 0;
	}
	public boolean isFull(){
		return size == this.capacity - 1;
	}
	public boolean isEmpty(){
		return size == 0;
	}
	public int size(){
		return size;
	}
	
	public void insert(int val){
		
		// code here
	}
	public void delete(){
		// code here
	}
	
	
 public void reheapifyDown(int[] heap, int start, int finish){
	 
	// code here
	 
 }
	
 public void reheapifyUp(int[] heap, int start){
	 // code here
	
 }
}
