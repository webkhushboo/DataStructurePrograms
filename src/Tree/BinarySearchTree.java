package Tree;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;

class BinarySearchTree{
	Node root ;
	BinarySearchTree(){
		root = null;
	}
	
	public void insert(int data){
		root= insert(root,data);
	}
	
	private Node insert(Node node , int data){
		if(node == null){
			node = new Node(data);
		}
		else if(node.getData() > data){
			node.left = insert(node.left,data);
		}
		else if(node.getData() < data){
			node.right = insert(node.right,data);
		}
		return node;
	}
	
	public void printPreOrderTraversal(Node root){
		if(root != null){
			System.out.println(root.data);
			printPreOrderTraversal(root.left);
			printPreOrderTraversal(root.right);
		}
	}
	
	public Node searchNode(Node root , int data){
		if(root.data == data) {
			return root;
		}
		else if(root.data > data)
		{
			return searchNode(root.left,data);
		} else if (root.data < data){
			return searchNode(root.right,data);
		}
		else 
			return null;
	}
	
	public void serialize(Node root,OutputStream fout) throws IOException{
		 if (root == null)
		    {
		        fout.write(-1);
		        
		    }
		 else{
		    // Else, store current node and recur for its children
		    fout.write(root.data);
		    System.out.println(root.data);
		    serialize(root.left, fout);
		    serialize(root.right, fout);
		 }
	}
    public	void deSerialize(Node root ,ObjectInputStream in) throws IOException, ClassNotFoundException
	{
	    // Read next item from file. If theere are no more items or next
	    // item is marker, then return
    	int val = in.read();
	    if(val == -1)
	    return; 	
    	
	    System.out.println(val); 
	    // Else create node with this item and recur for children
	    root = new Node(val);
	    deSerialize(root.left, in);
	    deSerialize(root.right, in);
	}
}