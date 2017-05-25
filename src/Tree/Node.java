package Tree;

class Node
{
    int data;
    Node left;
	Node right;
 
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
    
    public int getData(){
    	return data;
    }
}