package LinkedList;


public class Node {

	private int data ;
	public Node next ;
	
	
	public Node(){
		next = null;
		data =0;
	}
	
	public Node(int data){
		next = null;
		this.data=data;
	}
	
	public int getData(){
		return data;
	}
}
