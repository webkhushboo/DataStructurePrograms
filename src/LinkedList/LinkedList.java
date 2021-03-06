package LinkedList;


public class LinkedList {

	private  Node head;
	Node left ;
	public LinkedList(){
		head= null;
    }
	
	public Node addNode(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		} else {
			Node current = head;
			while(current.next != null){
				current = current.next;
			}
			current.next = newNode;
			
		}
		return newNode;
	}
	
	Node InsertNth(Node head, int data, int position) {
	 if(head == null && position ==0){
		 head = new Node(data);
	 }	
	 else {
		 Node temp = head;
		 int i=0;
		 while(temp != null && i < position-1){
			 temp =temp.next;
			 i++;
		 }
		 Node node  = new Node(data);
		 if(temp.next == null)
		 temp.next =node;
		 else {
			 node.next = temp.next;
			 temp.next = node;
		 }
		 //temp =node;
	 } 
	 
		return head;
		   // This is a "method-only" submission. 
		    // You only need to complete this method. 
		}
	
	public void deleteNode(){
		if(head == null){
			System.out.println("Out of index so can't be deleted");
		} else if(head.next == null){
			head = null;
		} else {
		Node current = head;
		while(current.next.next !=null){
			 current= current.next;
			}
		current.next = null;
		}
	}
	public void printNode(Node head){
		Node current = head;
		if(head == null){
			System.out.println("Empty list");
		}
		while(current !=null){
		 System.out.println(current.getData());
		 current= current.next;
		}
	}
	
	public void printNthNodeFromLast(int n){
		int len =1;
		if(head == null) return;
		Node current = head;
		while(current.next != null){
			len++;
			current =current.next;
		}
		Node temp = head;
		for (int i =1 ; i< len-n+1;i++){
			temp = temp.next;
		}
		System.out.println(temp.getData());
	}
	
	public static Node reverseLinkedList(Node head){
		Node current = head;
		Node prev= null;
		Node next = null;
		while (current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
	
	public static Node reverseLinkedListInNGroupSize(Node head , int k){
		Node current = head;
		Node prev= null;
		Node next = null;
		int i =0;
		while (current != null && i<k){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			i++;
		}
		
		if (next != null) 
	          head.next = reverseLinkedListInNGroupSize(next, k);
		return prev;
	}
	
	public boolean detectLoopInLinkedList(Node root){
		boolean loopExists = false;
		Node fast_ptr = root, slow_ptr = root;
		while(fast_ptr != null && slow_ptr !=null && fast_ptr.next !=null){
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;
			if(fast_ptr == slow_ptr){
				loopExists =true;
				break;
			}
			
		}
		return loopExists;
		
	}
	
	//check recursively if linked list is pallindrome or not 
	// breakpoint is to traverse till the end of the list by checking if right.next == null
	public boolean checkPallindrome(Node right){
		boolean pallidromeExists = false;
	    left = head ;
		if(right == null)
		 return true;
		
		boolean isPallindrome = checkPallindrome(right.next);
		if(isPallindrome == false) 
			return false;
		
		pallidromeExists = left.getData() == right.getData();
		left= left.next;
		
		return pallidromeExists;
	}
	
	// find the intersection of two linked list
	public static Node getIntersection(Node head1, Node head2){
		Node temp =null;
		Node temp1 = head1;
		Node temp2 = head2;
		Node current1 = head1;
		Node current2 = head2;
		int count1 =0;
		int count2=0;
		while(temp1!=null){
			count1++;
			temp1= temp1.next;
		}
		while(temp2!=null){
			count2++;
			temp2 = temp2.next;
		}
		int diff =0;
		if(count1 > count2){
			diff = count1-count2;
			for(int i =0 ;i < diff ; i++){
				current1 = current1.next;
			}
		} else {
			diff = count2-count1;
			for(int i =0 ;i < diff ; i++){
				current2 = current2.next;
			}
			}
		
	  while(current1 !=null || current2 != null){
		    if(current1.getData() == current2.getData()){
		    	temp= current1;
		    	break;
		    }
		    current1 = current1.next;
		    current2 = current2.next;
	  }	
	  return temp;
	}
	public static void main(String[] args){
		LinkedList listspecific = new LinkedList();
		listspecific.head =listspecific.InsertNth(listspecific.head, 3, 0);
		listspecific.head =listspecific.InsertNth(listspecific.head, 5, 1);
		listspecific.head =listspecific.InsertNth(listspecific.head, 4, 2);
		listspecific.head =listspecific.InsertNth(listspecific.head, 2, 3);
		listspecific.head =listspecific.InsertNth(listspecific.head, 10, 1);
		listspecific.printNode(listspecific.head);
		/*LinkedList list = new LinkedList();
		LinkedList list2 = new LinkedList();
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		System.out.println("Before deleting element");
		list.printNode(list.head);
		
		System.out.println("After deleting element");
		list.deleteNode();
		list.deleteNode();
		list.deleteNode();
		list.printNode(list.head);
		
		System.out.println("Adding elements");
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(3);
		list.addNode(2);
		list.addNode(1);
		//list.addNode(6);
		list.printNode(list.head);
		System.out.println("Printing n'th element from last");
		list.printNthNodeFromLast(2);
		
		list2.addNode(100);
		list2.addNode(200);
		list2.addNode(300);
		list2.addNode(400);
		System.out.println("Printing second linked list");
		list2.printNode(list2.head);
		System.out.println("Printing reversed linked list");
		Node temp = reverseLinkedList(list2.head);
		list2.printNode(temp);
		
		LinkedList list21 = new LinkedList();
		list21.addNode(100);
		list21.addNode(200);
		list21.addNode(300);
		list21.addNode(400);
		list21.head.next.next.next = list21.head;
		boolean loop = list.detectLoopInLinkedList(list21.head);
		if(loop)
		System.out.println("Loop exists");
		else 
		System.out.println("Loop doesn't exists");
		System.out.println("Checking if list is pallindrome or not");
		boolean isP= list.checkPallindrome(list.head);
		if(isP)
		System.out.println("Pallindrome exists");
		else 
		System.out.println("Pallindrome doesn't exists");
		System.out.println("Printing Intersection of two linked list");
		LinkedList list3 = new LinkedList();
		LinkedList list4 = new LinkedList();
		list3.addNode(10);
		list3.addNode(20);
		list4.addNode(20);
		Node intersectionOfLinkedList = getIntersection(list3.head, list4.head);
		if(intersectionOfLinkedList != null)
		System.out.println("Intersection of two linked list is :" + intersectionOfLinkedList.getData());
		else 
		System.out.println("No Intersection exist");	
		System.out.println("--------------------------Printing reverse linked list in 3 group size------------------------");
		LinkedList list5 = new LinkedList();
		list5.addNode(10);
		list5.addNode(20);
		list5.addNode(30);
		list5.addNode(40);
		list5.addNode(50);
		list5.addNode(60);
		list5.addNode(70);
		list5.addNode(80);
		list5.addNode(90);
		Node temp2 = reverseLinkedListInNGroupSize(list5.head,3);
		list5.printNode(temp2); */
	}
}
