package Tree;

public class ZigZagTraversal {
  private Node root;
  
  ZigZagTraversal(){
	  root = null;
  }
 public static void main(String[] args){
	 ZigZagTraversal tree = new ZigZagTraversal();
	 tree.root = new Node(1);
	 tree.root.left = new Node(2);
	 tree.root.right = new Node(3);
	 tree.root.left.left = new Node(7);
	 tree.root.left.right = new Node(6);
	 tree.root.right.left = new Node(5);
	 tree.root.right.right=new Node(4);
	 
	 printZigZagTree(tree.root);
 }
private static void printZigZagTree(Node root) {
	// TODO Auto-generated method stub
	
	int height = getHeight(root);
	int i=1;
	Boolean flagLtr =true;
	while(i <= height){
		printGivenLevel(root ,i++,flagLtr);
		flagLtr = !flagLtr;       		
	}
}
private static void printGivenLevel(Node root2, int level , Boolean flagLtr) {
	// TODO Auto-generated method stub
	if(root2 == null) return;
	if(level == 1){
		System.out.println(root2.data);
	} else if(level >1 ){
	if(flagLtr) {
		printGivenLevel(root2.left , level-1 ,flagLtr);
		printGivenLevel(root2.right , level-1 ,flagLtr);
	}
	else {
		printGivenLevel(root2.right , level-1 ,flagLtr);
		printGivenLevel(root2.left , level-1 ,flagLtr);
	} }
}
private static int getHeight(Node root) {
	// TODO Auto-generated method stub
	if(root == null)
	return 0;
	else {
		int lheight = getHeight(root.left);
		int rheight = getHeight(root.right);
		if(lheight >rheight) {
			return lheight+1;
		} 
		else 
			return rheight+1;
	}
}
}
