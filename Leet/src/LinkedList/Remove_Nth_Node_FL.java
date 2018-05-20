package LinkedList;

import java.util.Scanner;

class Node{
	protected int data;
	protected Node next;
	public Node(){
		this.data = 0;
		this.next = null;
		
	}
	public Node(int data, Node n){
		this.data = data;
		this.next = n;
		
	}
	public void setNext(Node n){
		
		next = n;
	}
	public void setData(int data){
		
		this.data = data;
	}
	public Node getNext(){
		return next;
	}
	public int getData(){
		return data;
	}
}
class LinkedList{
	
	protected Node head;
	protected Node end;
	public int size;
	
	public LinkedList(){
		head = null;
		end = null;
		size = 0;
	}
	public boolean isEmpty(){
		
		return head == null;
	}
	public int getSize(){
		return size;
	}
	public void insertAtStart(int val){
		Node nptr = new Node(val , null);
	size++;
	if(head == null){
		head = nptr;
		end = head;
	}
	else{
		nptr.setNext(head);
		head = nptr;
	}
	}
	public void insertAtEnd(int val){
		Node nptr = new Node(val, null);
		size++;
		if(head == null){
			head = nptr;
			end = head;
		}
		else{
			
			end.setNext(nptr);
			end = nptr;
		}
	}
	public void insertAtPos(int val, int pos){
		Node nptr = new Node(val, null);
		
		Node ptr = head;
		pos = pos -1;
		for(int i = 1; i < size; i++){
			
			if(i == pos){
				Node tmp = ptr.getNext();
				ptr.setNext(nptr);
				nptr.setNext(tmp);
				break;
			}
			
			ptr = ptr.next;
		}
		size++;
	}
	public void deleteAtPos(int pos){
		
		if(pos == 1){
			head = head.getNext();
			size--;
			return;
		}
		if(pos == size){
			Node s = head;
			Node t = head;
			while(s != end){
				t = s; 
				s = s.getNext();
			}
			end = t; 
			end.setNext(null);
			size--;
		}
		Node ptr = head;
		pos = pos - 1;
		for(int i = 1; i < size - 1 ; i++){
		
			if(i == pos){
				
				Node temp = ptr.getNext();
				temp = temp.getNext();
				ptr.setNext(temp);
				break;
			}
			ptr = ptr.getNext();
		}
		size--;
	}
	public void display()
    {
        System.out.print("\nSingly Linked List = ");
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }    
        if (head.getNext() == null) 
        {
            System.out.println(head.getData() );
            return;
        }
        Node ptr = head;
        System.out.print(head.getData()+ "->");
        ptr = head.getNext();
        while (ptr.getNext() != null)
        {
            System.out.print(ptr.getData()+ "->");
            ptr = ptr.getNext();
        }
        System.out.print(ptr.getData()+ "\n");
    }
}


public class Remove_Nth_Node_FL {

	public static void main(String arg[]){
		
		Remove_Nth_Node_FL rm = new Remove_Nth_Node_FL();
		Scanner scan = new Scanner(System.in);
        /* Creating object of class linkedList */
        LinkedList list = new LinkedList(); 
        System.out.println("Singly Linked List Test\n");          
        char ch;
        /*  Perform list operations  */
        do
        {
            System.out.println("\nSingly Linked List Operations\n");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. insert at position");
            System.out.println("4. delete at position");
            System.out.println("5. check empty");
            System.out.println("6. get size");            
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                list.insertAtStart( scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to insert");
                list.insertAtEnd( scan.nextInt() );                     
                break;                         
            case 3 : 
                System.out.println("Enter integer element to insert");
                int num = scan.nextInt() ;
                System.out.println("Enter position");
                int pos = scan.nextInt() ;
                if (pos <= 1 || pos > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.insertAtPos(num, pos);
                break;                                          
            case 4 : 
                System.out.println("Enter position");
                int p = scan.nextInt() ;
                if (p < 1 || p > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.deleteAtPos(p);
                break;
            case 5 : 
                System.out.println("Empty status = "+ list.isEmpty());
                break;                   
            case 6 : 
                System.out.println("Size = "+ list.getSize() +" \n");
                break;                         
             default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            /*  Display List  */ 
            list.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');       
		
		
	}
	
	
	
}
