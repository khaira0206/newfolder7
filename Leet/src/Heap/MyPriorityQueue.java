package Heap;

public class MyPriorityQueue {

	int capacity, size;
	Task[] heap;
	
	public static void main(String[] args){
		
		Task[] tasks = {new Task("hey", 1),
						new Task("hi", 9),
						new Task("hell", 3),
						new Task("hello", 7),
						new Task("by", 4),
						new Task("bye", 6),
						new Task("bey-by", 2),
						new Task("bye-bye", 8)};
		MyPriorityQueue pq = new MyPriorityQueue(9);
		for(Task task: tasks){
		pq.insert(task);
	}
	
		while(pq.size() >= 1){
			System.out.println(pq.remove().job);
		}
	}
	
	public MyPriorityQueue(int capacity){
		this.capacity = capacity;
		size = 0;
		heap = new Task[this.capacity + 1];
	}
	
	public void clearQueue(){
		heap = new Task[this.capacity + 1];
		size = 0;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public boolean isFull(){
		return size == this.capacity - 1;
	}
	public int size(){
		return size;
	}
	
	public void insert(Task task){
		
		if(isFull()){
			System.out.println("Overflow");
		return;
		}
		
		heap[++size] = task;
		
		reheapifyUp(heap, size - 1 );
		
		
	}
	
	
	
	public void reheapifyUp(Task[] heap , int start ){
		int  parent;
		Task temp;
		if(start > 1){
			parent = start / 2;
			if(heap[parent].priority < heap[start].priority){
				temp = heap[start];
				heap[start] = heap[parent];
				heap[parent] = temp;
				reheapifyUp(heap, parent);
			}
		}
		
	}
	public Task remove(){
		if(isEmpty()){
			System.out.println("Underflow");
		return null;
		}
		Task task = heap[1];
		heap[1] = heap[size--];
		reheapifyDown(heap, 1, size);
		return task;
	}
	public void reheapifyDown(Task[] heap, int start, int finish){
		
		int lchild, rchild, index, max;
		Task temp;
		
		lchild = 2*start;
		rchild = lchild + 1;
		if(lchild <= finish){
			index = lchild;
            max = heap[index].priority;
            if(rchild <= finish){
            if(heap[rchild].priority > max){
            	max = heap[rchild].priority;
                index = rchild;
             }
            }
		
		if(heap[start].priority < heap[index].priority){
		temp = heap[start];
		heap[start] = heap[index];
		heap[index] = temp;
		reheapifyDown(heap, index, finish);
		}
	}
		
		
	}
	

}