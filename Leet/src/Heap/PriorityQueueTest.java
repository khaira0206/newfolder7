package Heap;

class Task{
	
	String job;
	int priority;
	
	public Task(String job, int priority){
		this.job = job;
		this.priority = priority;
	}
	
	public String toString(){
		return "Job" + job  +"\nPriority"+ priority;
	}
}

class PriorityQueue{
	
	Task[] heap;
	int heapSize, capacity;
	
	public PriorityQueue(int capacity){
		this.capacity = capacity + 1;
		heap = new Task[capacity];
		heapSize = 0;
	}
	
	public boolean isEmpty(){
		return heapSize == 0;
	}
	
	public void clear(){
		heap = new Task[capacity];
		heapSize = 0;
	}
	public boolean isFull(){
		return heapSize == capacity - 1;
	}
	public int size(){
		return heapSize;
	}
	
	public void insert(String job, int priority){
		Task newJob = new Task(job, priority);
		
		heap[++heapSize] = newJob;
		int pos = heapSize;
		
		while(pos != 1 && newJob.priority > heap[pos/2].priority){
			
			heap[pos] = heap[pos/2];
			pos /= 2;
		}
		heap[pos] = newJob;
	}
	
	public Task remove(){
		Task temp,item;
		int parent, child;
		
		parent = 1;
		child = 2;
		
		if(isEmpty()){
			System.out.println("Heap is Empty");
			return null;
		}
		
		item = heap[1];
		temp = heap[heapSize--];
		
		while(child <= heapSize){
			
			if(child < heapSize && heap[child].priority < heap[child + 1].priority){
				child++;
			}
			if(temp.priority > heap[child].priority){
				
				break;
			}
			heap[parent] = heap[child];
			parent = child;
			child *=2;
			
		}
		heap[parent] = temp;
		return item;
	}
	
}


public class PriorityQueueTest {
	
	
	
	public static void main(String args[]){
		
	}

}
