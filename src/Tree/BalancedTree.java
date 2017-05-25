package Tree;

public class BalancedTree {

	Node root;
	public BalancedTree(int data){
		root = new Node(data);
	}
	
	public Boolean isBalanced(Node n){
		if(balancedHeight(n)>-1)
			return true;
		return false;
	}
	private int balancedHeight(Node n) {
		// TODO Auto-generated method stub
		if(n == null)
		return 0;
		else {
			int h1 = balancedHeight(n.left);
			int h2 = balancedHeight(n.right);
			if(h1 == -1 || h2 == -1) return -1;
			if(Math.abs(h1-h2)>1) return -1;
			if(h1 > h2) return h1+1;
			return h2+1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	BalancedTree tree = new BalancedTree(10);
	tree.root.left = new Node(1);
	tree.root.right = new Node(2);
	tree.root.left.left = new Node(3);
	tree.root.left.right = new Node(4);
	Boolean isBalanced = tree.isBalanced(tree.root);
	if(isBalanced ==true)
		System.out.println("Balanced tree");
	else 
		System.out.println("Not balanced tree");
	}
	

}
