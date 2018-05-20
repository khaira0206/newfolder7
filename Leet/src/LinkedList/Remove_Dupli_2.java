package LinkedList;

public class Remove_Dupli_2 {

	
	public static void main(String arg[]){
		
		Remove_Dupli_2 rd = new Remove_Dupli_2();
	LinkedList list = new LinkedList();
	list.insertAtEnd(1);
	list.insertAtEnd(1);
	list.insertAtEnd(2);
	list.insertAtEnd(2);
	list.insertAtEnd(3);
	list.insertAtEnd(3);
	list.display();
	Node node = rd.remove_Dup(list.head);
	
	LinkedList list1 = new LinkedList();
	list1.head.setNext(node);
	list1.display();
	
	}
	
	public Node remove_Dup(Node head){
		Node FakeHead=new Node();
        FakeHead.next=head;
        Node pre=FakeHead;
        Node cur=head;
		while(cur != null){
			
			while(cur.next != null && cur.data == cur.next.data ){
				cur = cur.next;
			}
			if(pre.next == cur){
				pre = pre.next;
				
			}else{
				
				pre.next = cur;
				
			}
			cur = cur.next;
		}
		
		return FakeHead.next;
		
	}
	
}
